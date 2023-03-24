package Persistence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.GruposMod;
import Model.RodadaMod;
import Model.TimesMod;

public class DaoTime {
	private Connection c;
	private String msg="";
	public DaoTime() {
		Connect con = new Connect();
		try {
			c = con.getC();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<TimesMod> getTimes() throws SQLException {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("SELECT T.NOMETIME,T.CIDADE,T.ESTADIO,T.MATERIALE ");
		sb1.append("FROM TIMES T ORDER BY T.NOMETIME");
		PreparedStatement ps = c.prepareStatement(sb1.toString());
		ResultSet rs = ps.executeQuery();
		List<TimesMod> lt = new ArrayList();
		while(rs.next()) {
			TimesMod t = new TimesMod();
			t.setNomeTime(rs.getString("NOMETIME"));
			t.setCidade(rs.getString("CIDADE"));
			t.setEstadio(rs.getString("ESTADIO"));
			t.setMaterial(rs.getString("MATERIALE"));
			lt.add(t);
		}
		return lt;
	}
	public List<GruposMod> getGrupos(String grup) throws SQLException {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("SELECT T.NOMETIME,G.GRP FROM GRUPO G INNER JOIN TIMES T ");
		sb1.append("ON T.CODIGOTIME = G.TIMECOD WHERE G.GRP LIKE ? ");
		PreparedStatement ps = c.prepareStatement(sb1.toString());
		ps.setString(1, grup);
		ResultSet rs = ps.executeQuery();
		List<GruposMod> lt = new ArrayList<GruposMod>();
		while(rs.next()) {
			GruposMod g = new GruposMod();
			g.setNomeTime(rs.getString("NOMETIME"));
			g.setGrupo(grup);
			lt.add(g);
		}
		return lt;
	}
	public List<RodadaMod> getRodada(LocalDate ld) throws SQLException{
		setMsg("");
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT T1.NOMETIME AS TIME_A,J.GOLSTIMEA,T2.NOMETIME AS TIME_B, ");
		sb.append("J.GOLSTIMEB  FROM JOGOS J INNER JOIN TIMES T1 ON ");
		sb.append("J.CODIGOTIMEA = T1.CODIGOTIME INNER JOIN TIMES T2 ");
		sb.append("ON T2.CODIGOTIME = J.CODIGOTIMEB ");
		sb.append("WHERE CONVERT(VARCHAR(12),J.DATA,31) = ? ");
		
		PreparedStatement ps = c.prepareStatement(sb.toString());
		ps.setDate(1, Date.valueOf(ld));
		//System.out.println(Date.valueOf(ld));
		List<RodadaMod> lc = new ArrayList<RodadaMod>();
		
		ResultSet rs = ps.executeQuery();
		//System.out.println("ok execker");
		while(rs.next()) {
			RodadaMod rdm = new RodadaMod();
			rdm.setTimeNomeA(rs.getString("TIME_A"));
			rdm.setTimeNomeB(rs.getString("TIME_B"));
			rdm.setGolsA(rs.getInt("GOLSTIMEA"));
			rdm.setGolsB(rs.getInt("GOLSTIMEB"));
			rdm.setData(ld);
			lc.add(rdm);
			//System.out.println(rdm);
		}
		
		if(lc.isEmpty() == true) {
			setMsg("Nao ha jogos na data especificada");
		}
		return lc;
	}
	public void RodadasGen() throws SQLException {
		String sql ="{CALL INITIAL}";
		CallableStatement cs = c.prepareCall(sql);
		cs.execute();
		cs.close();
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

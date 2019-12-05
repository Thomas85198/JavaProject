package tw.luchienlin.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class JDBCtest {
	private Connection conn;

	public boolean CreateConn() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String urlstr = "jdbc:sqlserver://localhost:1433;databaseName=ThomasPower;user=sa;password=passw0rd;";
			conn = DriverManager.getConnection(urlstr);
			boolean status = !conn.isClosed();
			return true;
		} catch (Exception e) {
			System.out.println("e" + e);
			return false;
		}
	}

	// 寫要求輸入的Scanner方法
	public boolean TestIDPWD() throws SQLException {
		String sqlStr = "SELECT * FROM SIGNIN WHERE ID=? AND PWD=?";
		Scanner input = new Scanner(System.in);
		System.out.println("アカウント番号を入力してください：");
		String ID;
		ID = input.nextLine();
		System.out.println("パスワードを入力してください：");
		String PWD;
		PWD = input.nextLine();
		// 測試是否輸入成功
//		System.out.println("您輸入的帳號為："+ID+"您輸入的密碼為："+PWD);
		while (ID.equals("") || PWD.equals("")) {
			input.reset();
			System.out.println("再入場するか、IDにゼロを入力して退出してください");
			System.out.println("アカウント番号を入力してください：");
			ID = input.nextLine();
			System.out.println("パスワードを入力してください：");
			PWD = input.nextLine();
//			System.out.println(ID);
//			System.out.println(PWD);
			if (Integer.parseInt(ID) == 0) {

				break;
//				input.close();
//				System.out.println("Close Complete");
			}
		}
		boolean flag1 = false;
		PreparedStatement state = conn.prepareStatement(sqlStr);
		state.setString(1, ID);
		state.setString(2, PWD);
//		設定rs讓他一筆一筆查
		ResultSet rs = state.executeQuery();
		// 有沒有下一筆資料
		while(rs.next()) {
			flag1 = true;
			System.out.println("ログインしてみてください...");
			System.out.println("ログイン成功");
		}
		if(flag1 == false) {
			System.out.println("ログインに失敗しました");
		}
//		state.execute();
		rs.close();
		state.close();
		return flag1;
	}

	public void Lottery() {
		Scanner input = new Scanner(System.in);
		HashMap<Integer,Integer> count = new HashMap<Integer, Integer>();
		System.out.println("請輸入想要的樂透組數：");
		int group = input.nextInt();
		int times = group*10;
		for(int i=1; i<times; i++) {
			int rnum = (int)(Math.random()*42+1);
//			System.out.println(rnum);
			if(count.get(rnum)==null) {
				//隨機產生第一個數字放到map裡面並統計++
				//上面這個hashmap通常都是要先這樣
				count.put(rnum,1);
			}else {
				//之後遇到同樣的數字，次數+1
				count.put(rnum, count.get(rnum)+1);
			}
		}
		for(Integer keys: count.keySet()) {
			System.out.println(keys+":"+count.get(keys));
		}
		
	}
	public static void main(String[] args) {
		JDBCtest test = new JDBCtest();
		boolean connStatus = test.CreateConn();
		
		try {
			if (connStatus) {
				
				test.CreateConn();
				System.out.println("正常に接続しました");
//				test.TestIDPWD();
				//判斷是否登入
//				boolean testLogin = test.TestIDPWD();
				test.Lottery();
				
//				System.out.println(testLogin);
				test.closeConn();
			} else {
				System.out.println("接続に失敗しました");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void closeConn() throws SQLException {
		// 如果connection有東西就要close
		if (conn != null) {
			conn.close();
			System.out.println("接続が閉じられました");
		}
	}
}
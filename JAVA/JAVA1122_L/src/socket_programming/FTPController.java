package socket_programming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FTPController {
	
	private FTPClient ftpClient;
	
	public FTPController() {
		this.ftpClient = new FTPClient();
	}
	
	// FTP 연결 및 설정
	// ip : FTP IP, port : FTP port, id : FTP login Id, pw : FTP login pw, dir : FTP Upload Path
	public void connect(String dir) throws Exception{
		try {
//			String ftpProperties = "config/ftp.properties";
//			Properties properties = new Properties();
//			Reader reader = Resources.getResourceAsReader(ftpProperties);
//			properties.load(reader);
			
			String ip = "db.itwillbs.dev";
			int port = 8030;
			String id = "class3_220630_team1";
			String passwd = "1234";
			
			boolean result = false;
			ftpClient.connect(ip, port);			//FTP 연결
			ftpClient.setControlEncoding("UTF-8");	//FTP 인코딩 설정
			int reply = ftpClient.getReplyCode();	//응답코드 받기
	        
			if (!FTPReply.isPositiveCompletion(reply)) {	//응답 False인 경우 연결 해제
				ftpClient.disconnect();
				System.out.println("FTP서버 연결실패");
				throw new Exception("FTP서버 연결실패");
			}
			if(!ftpClient.login(id, passwd)) {
				ftpClient.logout();
				System.out.println("FTP서버 로그인실패");
				throw new Exception("FTP서버 로그인실패");
			}
	        
			ftpClient.setSoTimeout(1000 * 10);		//Timeout 설정
			ftpClient.login(id, passwd);				//FTP 로그인
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);	//파일타입설정
			ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
			ftpClient.enterLocalPassiveMode();			//Active 모드 설정
			result = ftpClient.changeWorkingDirectory(dir);	//저장파일경로

			if(!result){	// result = False 는 저장파일경로가 존재하지 않음
				ftpClient.makeDirectory(dir);	//저장파일경로 생성
				ftpClient.changeWorkingDirectory(dir);	
			}
			
			System.out.println("FTP서버 연결 성공! - " + ftpClient.printWorkingDirectory());
			getFtpInfo();
		} catch (Exception e) {
			if(e.getMessage().indexOf("refused") != -1) {
				System.out.println("FTP서버 연결실패");
				throw new Exception("FTP서버 연결실패");
			}
            throw e;
		}
	}

	// FTP 연결해제
	public void disconnect(){
		try {
			if(ftpClient.isConnected()){
				ftpClient.disconnect();
			}
		} catch (IOException e) {
			int a = 0; 
			int b = 0;
			a = b;
			b = a;
		}
	}

	// FTP 파일 업로드
	public void storeFile(String saveFileNm, InputStream inputStream) throws Exception{
		try {
			System.out.println("storeFile()");
			System.out.println("saveFileNm : " + saveFileNm);
			boolean uploadResult = ftpClient.storeFile(saveFileNm, inputStream);
			System.out.println("업로드 결과 : " + uploadResult);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getFtpInfo() {
		try {
			System.out.println(ftpClient.getStatus());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package socket_programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class ExFTP {

	public static void main(String[] args) {
		FTPClient ftpClient = new FTPClient();
		
		String ip = "db.itwillbs.dev";
		int port = 8030;
		String id = "class3_220630_team1";
		String passwd = "1234";
		
		String ftpDir = "/upload";
		
		try {
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
			result = ftpClient.changeWorkingDirectory(ftpDir);	//저장파일경로

			if(!result){	// result = False 는 저장파일경로가 존재하지 않음
				ftpClient.makeDirectory(ftpDir);	//저장파일경로 생성
				ftpClient.changeWorkingDirectory(ftpDir);	
			}
			
			
			File putFile = new File("D:", "funweb.sql");
			System.out.println("파일 실제 존재 여부 : " + putFile.exists());
			String fileName = "funweb.sql";
			InputStream inputStream = null;
			try {
				// PUT할 파일명 입력
				inputStream = new FileInputStream(putFile);
				boolean uploadResult = ftpClient.storeFile(fileName, inputStream);
				System.out.println("결과 : " + uploadResult);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				if (inputStream != null) {
					try {
						inputStream.close();// close를 하지 않는다면, 나중에 시스템부하가 일어날것이야.
						// 이런식으로 조건을 줘서 finally구문으로 마지막 한줄로 close()를 하자.
					} catch (IOException e1) {
					}
				}
			}
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

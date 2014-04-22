/**
 * Bangladesh Education Board Result Fetcher
 * Implementation : Sakib Sami
 * Email : s4kibs4mi@gmail.com
 * Web : www.sakibsami.com
 * Extra Library used : httpclient , jsoup
 */

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Jsoup;

public class ResultFetcher {
	public String sr = "3";
	public String et = "0";
	public String examName;
	public String examYear;
	public String examBoard;
	public String examRoll;
	public String homeLink = "http://archive.educationboard.gov.bd/index.php";
	public String resultLink = "http://archive.educationboard.gov.bd/result.php";
	public String sessionID;
	
	public ResultFetcher(){}
	public ResultFetcher(String examName,String examYear,String examBoard,String examRoll){
		this.examName = examName;
		this.examYear = examYear;
		this.examBoard = examBoard;
		this.examRoll = examRoll;
	}
	
	public void getResult(){
		HttpClient connect = new HttpClient();
		PostMethod fetchData;
		try {
			fetchData = new PostMethod(homeLink);
			int i = connect.executeMethod(fetchData);
			sessionID = fetchData.getResponseHeader("Set-Cookie").getValue(); // Getting Session
			sessionID = sessionID.substring(0, sessionID.indexOf(';')+1);
			
			PostMethod parameters = new PostMethod(resultLink);
			
			parameters.addRequestHeader("Cookie",sessionID); // Setting up Session
			
			// Adding Parameters
			parameters.addParameter("sr", sr);
			parameters.addParameter("et", et);
			parameters.addParameter("exam", examName);
			parameters.addParameter("year", examYear);
			parameters.addParameter("board", examBoard);
			parameters.addParameter("roll", examRoll);
			parameters.addParameter("button2","Submit");

			i = connect.executeMethod(parameters);
			if(i != -1){
				System.out.println(htmlRemove(parameters.getResponseBodyAsString()));
			}
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public String htmlRemove(String html) {
	    return Jsoup.parse(html).text();
	}
}

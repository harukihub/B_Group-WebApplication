import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//■サーブレットクラスlocalhost:8080/
//■URL
//　http://localhost:8080/HelloWorldWeb/HelloWorldWebServlet
//　このURLを打ったらJavaのファイルを実行するようにしたい場合
//■@WebServlet()アノテーションで、URLとサーブレットクラスを紐づけする
//　アノテーションを付けることでTomcatが勝手にやってくれる
@WebServlet("/HelloWorldWebServlet")
public class HelloWorldWebServlet extends HttpServlet{

	//■Getリクエスト/GET送信
	//　サーバーから情報を取得する
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//super.doGet(request, response);
		System.out.println("doGet()");
		
		//■コンテントタイプ
		//送信データの種類を指定
		//■HTMLのコードを送り返すとき
		response.setContentType("text/html; charset=UTF-8;");
		//■画像を送り返す
		////　インスタンスを保存する
		//　ファイルに保存。ネットワークに送信する。
		//■参考URL
		//  https://qiita.com/Sekky0905/items/b3c6776d10f183d8fc89

		//■ObjectOutputStream  
		//  インスタンスの保存
		//  インスタンス => ファイル
		
		//■ObjectInputStream 
		//  インスタンスの復元
		//  ファイル => インスタンスresponse.setContentType("image/png");
		
		//サーバからクライアント（ブラウザ）にデータを送信する
		PrintWriter out = response.getWriter();
//		out.println("hoge");
//		out.write("piyo");
//		out.append("fuga");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Hello World Web!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World Web!!!!</h1>");
		int randomNumber = new Random().nextInt();
		if(randomNumber % 2 == 0) {
			System.out.println("<h1>みなとです</h1>");
		}
		out.println("</body>");
		out.println("</html>");
		
	}

	//■Postリクエスト/POST送信
	//　サーバーに情報を送信する
	//　商品登録画面、商品変更画面
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//super.doPost(request, response);
		System.out.println("doPost()");
	}
	
	

}

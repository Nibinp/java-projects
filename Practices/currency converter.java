import java.util.Scanner;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;

import com.mashape.unirest.http.HttpResponse;

public class rapidapi {
	
	public static String symbol(String country) throws URISyntaxException, IOException, InterruptedException
	{
		HttpClient client =  HttpClient.newHttpClient();
		HttpRequest httprequest =  HttpRequest.newBuilder()
				.uri(new URI("https://siddiquie.p.rapidapi.com/api.siddiquie.net/Currency/xml.php"))
				.header("X-RapidAPI-Key", "a8b6215eccmshf0905faa3071a06p168dabjsne610ca201b29")
				.header("X-RapidAPI-Host", "siddiquie.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
			
		java.net.http.HttpResponse<String> response = client.send(httprequest, BodyHandlers.ofString());
		System.out.println(response.body());
		
		
		
		return response.body();
	}

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("\t---CURRENCY CONVERTER---");
			System.out.print("\n\tFROM :");
			String from =scan.next();
			System.out.print("\n\tTO   :");
			String to=scan.next();
			
			
			
			
			HttpClient client =  HttpClient.newHttpClient();
			HttpRequest httprequest =  HttpRequest.newBuilder()
					.uri(new URI("https://currency-exchange.p.rapidapi.com/exchange?from="+from+"&to="+to+"&q=1.0"))
					.header("X-RapidAPI-Key", "a8b6215eccmshf0905faa3071a06p168dabjsne610ca201b29")
					.header("X-RapidAPI-Host", "currency-exchange.p.rapidapi.com")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			
			java.net.http.HttpResponse<String> response = client.send(httprequest, BodyHandlers.ofString());
			System.out.println("\t"+response.body());
			Float EX=Float.parseFloat(response.body());
		
			
			
			System.out.println("\tEnter amount to convert from "+from+" to "+to+" :");
			Float amount =scan.nextFloat();
			Float new_amount=amount*EX;
			System.out.println("\tconverted money :" +new_amount);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("miscorrect input");
			e.printStackTrace();
		}
				

	}

}

import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Test {

	public static void main(String d[]){
		try {
			
			MongoClient mongoClient = new MongoClient("ds127375.mlab.com",27375);
			MongoClient mongo = new MongoClient(
					  new MongoClientURI( "mongodb://sabby138:nexus%40123@ds127375.mlab.com:27375/carrentalbilling" )
					);
			System.out.println("done");
			
			DB database = mongoClient.getDB("carrentalbilling");
			System.out.println("name: "+database.getName());
			
			/*List<String> dblist =  mongoClient.getDatabaseNames();
			System.out.println(dblist);*/
			// MongoCredential.createCredential("sabby138", "carrentalbilling", "nexus@123".toCharArray());
			 
			DBCollection collection =  database.getCollection("employee");
			//System.out.println();
			
			
			
			/*Cursor cursor = collection.find();
			while(cursor.hasNext()){
				System.out.println(cursor.next());
			}
			
			*/
			BasicDBObject basicDBObject = new BasicDBObject("firstName","avani")
														.append("lastName", "masuria");
			collection.insert(basicDBObject);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

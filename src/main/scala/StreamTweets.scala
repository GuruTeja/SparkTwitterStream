import org.apache.spark.SparkConf
import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.twitter.TwitterUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}


/**
 * Created by mayanka on 9/22/15.
 */
object StreamTweets {

  def main(args: Array[String]) {

    val filters = args

    // Set the system properties so that Twitter4j library used by twitter stream
    // can use them to generate OAuth credentials

    System.setProperty("twitter4j.oauth.consumerKey", "QTVD2zYsd9MMIHl7T31mWJ3r3")
    System.setProperty("twitter4j.oauth.consumerSecret", "nR7Z9t6VvWWSEyFVBEBrUsdVeMwxkddJ96V1hBiI816kbrwaDc")
    System.setProperty("twitter4j.oauth.accessToken", "175311186-d5S0jadlEdfbNjrr4Q1XmgOcqmzX9Mf0nh0xWpuj")
    System.setProperty("twitter4j.oauth.accessTokenSecret", "kHdZsvQQuh6IKIKdLHQ6oU7s6XfOhFTM1bntT8IAU5k2j")

    //Create a spark configuration with a custom name and master
    // For more master configuration see  https://spark.apache.org/docs/1.2.0/submitting-applications.html#master-urls
    val sparkConf = new SparkConf().setAppName("twitterspark_guru").setMaster("local[*]")
    //creating streaming context with 2 second window
    val ssc = new StreamingContext(sparkConf, Seconds(2))



  }

}

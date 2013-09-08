package utils;

import java.math.BigDecimal;

import models.LastTrade;
import apis.ANXapi;
import apis.MarketApi;

public class settings {
	public static LastTrade lasttrade=null;
	public static BigDecimal funds= new BigDecimal(0.0000000);
	public static MarketApi market=new ANXapi("","");
	public static String ConfigFilePath="traderbot.config";
	public static boolean debug=true;
}

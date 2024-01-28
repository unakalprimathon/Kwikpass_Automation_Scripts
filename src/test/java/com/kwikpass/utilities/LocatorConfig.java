package com.kwikpass.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LocatorConfig {

	Properties pro;
	public LocatorConfig() {
		File src = new File("./Configuration/locator_config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	public String getmobile_input() {
		String mobile_input = pro.getProperty("mobile_input");
		return mobile_input;
		
	}
	public String getmobile_number() {
		String mobile_number = pro.getProperty("mobile_number");
		return mobile_number;
	}
	public String getotp() {
		String otp = pro.getProperty("otp");
		return otp;
	}
	public String getotp_input() {
		String otp_input = pro.getProperty("otp_input");
		return otp_input;
	}
	public String getkwikpass_iframe() {
		String kwikpass_iframe = pro.getProperty("kwikpass_iframe");
		return kwikpass_iframe;
	}
	public String getgokwik_iframe() {
		String gokwik_iframe = pro.getProperty("gokwik_iframe");
		return gokwik_iframe;
	}
	public String getwhatsappid() {
		String whatsappid = pro.getProperty("whatsappid");
		return whatsappid;
	}
	public String getkwikpass_icon_al() {
		String kwikpass_icon_al = pro.getProperty("kwikpass_icon_al");
		return kwikpass_icon_al;
	}
	public String getlogout_btn() {
		String logout_btn = pro.getProperty("logout_btn");
		return logout_btn;
	}
	public String getacc_logout_btn() {
		String acc_logout_btn = pro.getProperty("acc_logout_btn");
		return acc_logout_btn;
	}
	public String getorderhistory_btn() {
		String orderhistory_btn = pro.getProperty("orderhistory_btn");
		return orderhistory_btn;
	}
	public String getkwikpass_icon_bl() {
		String kwikpass_icon_bl = pro.getProperty("kwikpass_icon_bl");
		return kwikpass_icon_bl;
	}
	public String gethokorderhistory_btn() {
		String hokorderhistory_btn = pro.getProperty("hokorderhistory_btn");
		return hokorderhistory_btn;
	}
	public String gethokselect_size() {
		String hokselect_size = pro.getProperty("hokselect_size");
		return hokselect_size;
	}
	public String gethokbuynow() {
		String hokbuynow = pro.getProperty("hokbuynow");
		return hokbuynow;
	}
	public String gethokclose() {
		String hokclose = pro.getProperty("hokclose");
		return hokclose;
	}
	public String gethoknothanks() {
		String hoknothanks = pro.getProperty("hoknothanks");
		return hoknothanks;
	}
	public String getgokwikname() {
		String gokwikname = pro.getProperty("gokwikname");
		return gokwikname;
	}
	public String getgokwikentermob() {
		String gokwikentermob = pro.getProperty("gokwikentermob");
		return gokwikentermob;
	}
	public String getgokwikclose() {
		String gokwikclose = pro.getProperty("gokwikclose");
		return gokwikclose;
	}
	public String getgokwikyes() {
		String gokwikyes = pro.getProperty("gokwikyes");
		return gokwikyes;
	}
	public String getfireboltt_buynow() {
		String fireboltt_buynow = pro.getProperty("fireboltt_buynow");
		return fireboltt_buynow;
	}
	public String getfireboltt_expresscheckout_btn() {
		String fireboltt_expresscheckout_btn = pro.getProperty("fireboltt_expresscheckout_btn");
		return fireboltt_expresscheckout_btn;
	}
	public String getfireboltt_cartclose() {
		String fireboltt_cartclose = pro.getProperty("fireboltt_cartclose");
		return fireboltt_cartclose;
	}
	public String gethammer_buynow() {
		String hammer_buynow = pro.getProperty("hammer_buynow");
		return hammer_buynow;
	}
	public String gethom_add_to_cart_btn() {
		String hom_add_to_cart_btn = pro.getProperty("hom_add_to_cart_btn");
		return hom_add_to_cart_btn;
	}
	public String gethom_cart_btn() {
		String hom_cart_btn = pro.getProperty("hom_cart_btn");
		return hom_cart_btn;
	}
	public String gethom_checkout() {
		String hom_checkout = pro.getProperty("hom_checkout");
		return hom_checkout;
	}
	public String gethom_close_checkout() {
		String hom_close_checkout = pro.getProperty("hom_close_checkout");
		return hom_close_checkout;
	}
	public String getincludbuynow() {
		String includbuynow = pro.getProperty("includbuynow");
		return includbuynow;
	}
	public String getlotusbuynow() {
		String lotusbuynow = pro.getProperty("lotusbuynow");
		return lotusbuynow;
	}
	public String getnobero_kwikpass_icon() {
		String nobero_kwikpass_icon = pro.getProperty("nobero_kwikpass_icon");
		return nobero_kwikpass_icon;
	}
	public String getnobero_login_btn() {
		String nobero_login_btn = pro.getProperty("nobero_login_btn");
		return nobero_login_btn;
	}
	public String getnobero_add_to_cart() {
		String nobero_add_to_cart = pro.getProperty("nobero_add_to_cart");
		return nobero_add_to_cart;
	}
	public String getnobero_Proceed_to_buy() {
		String nobero_Proceed_to_buy = pro.getProperty("nobero_Proceed_to_buy");
		return nobero_Proceed_to_buy;
	}
	public String getnobero_myaccount() {
		String nobero_myaccount = pro.getProperty("nobero_myaccount");
		return nobero_myaccount;
	}
	public String getorganic_add_to_cart_btn() {
		String organic_add_to_cart_btn = pro.getProperty("organic_add_to_cart_btn");
		return organic_add_to_cart_btn;
	}
	public String getorganic_placeorder_btn() {
		String organic_placeorder_btn = pro.getProperty("organic_placeorder_btn");
		return organic_placeorder_btn;
	}
	public String getgokwikskip() {
		String gokwikskip = pro.getProperty("gokwikskip");
		return gokwikskip;
	}
	public String getorganic_closecart_btn() {
		String organic_closecart_btn = pro.getProperty("organic_closecart_btn");
		return organic_closecart_btn;
	}
	public String getphoto_jewel_buynow_btn() {
		String photo_jewel_buynow_btn = pro.getProperty("photo_jewel_buynow_btn");
		return photo_jewel_buynow_btn;
	}
	public String getphoto_jewel_placeorder_btn() {
		String photo_jewel_placeorder_btn = pro.getProperty("photo_jewel_placeorder_btn");
		return photo_jewel_placeorder_btn;
	}
	public String getphoto_jewel_closecart_btn() {
		String photo_jewel_closecart_btn = pro.getProperty("photo_jewel_closecart_btn");
		return photo_jewel_closecart_btn;
	}
	public String getmyfitness_allow() {
		String myfitness_allow = pro.getProperty("myfitness_allow");
		return myfitness_allow;
	}
	public String getpinkfort_size() {
		String pinkfort_size = pro.getProperty("pinkfort_size");
		return pinkfort_size;
	}
	public String getpinkfort_addtocart() {
		String pinkfort_addtocart = pro.getProperty("pinkfort_addtocart");
		return pinkfort_addtocart;
	}
	public String getpinkfort_UPI_CARD_COD() {
		String pinkfort_UPI_CARD_COD = pro.getProperty("pinkfort_UPI_CARD_COD");
		return pinkfort_UPI_CARD_COD;
	}
	public String getpinkfort_close_cart() {
		String pinkfort_close_cart = pro.getProperty("pinkfort_close_cart");
		return pinkfort_close_cart;
	}
	public String getsafari_buynow() {
		String safari_buynow = pro.getProperty("safari_buynow");
		return safari_buynow;
	}
	public String getsereko_addtocart() {
		String sereko_addtocart = pro.getProperty("sereko_addtocart");
		return sereko_addtocart;
	}
	public String getsereko_placeorder_btn() {
		String sereko_placeorder_btn = pro.getProperty("sereko_placeorder_btn");
		return sereko_placeorder_btn;
	}
	public String getsereko_close_cart() {
		String sereko_close_cart = pro.getProperty("sereko_close_cart");
		return sereko_close_cart;
	}
	public String getswissbeauty_addtocart() {
		String swissbeauty_addtocart = pro.getProperty("swissbeauty_addtocart");
		return swissbeauty_addtocart;
	}
	public String getswissbeauty_buynow() {
		String swissbeauty_buynow = pro.getProperty("swissbeauty_buynow");
		return swissbeauty_buynow;
	}
	public String getswissbeauty_cart_close() {
		String swissbeauty_cart_close = pro.getProperty("swissbeauty_cart_close");
		return swissbeauty_cart_close;
	}
	public String getsilvertraq_buynow() {
		String silvertraq_buynow = pro.getProperty("silvertraq_buynow");
		return silvertraq_buynow;
	}
	public String getsilvertraq_spinnow() {
		String silvertraq_spinnow = pro.getProperty("silvertraq_spinnow");
		return silvertraq_spinnow;
	}
	public String getsilvertraq_spinwheel_text_xpath() {
		String silvertraq_spinwheel_text_xpath = pro.getProperty("silvertraq_spinwheel_text_xpath");
		return silvertraq_spinwheel_text_xpath;
	}
	public String getsilvertraq_spinwheel_text() {
		String silvertraq_spinwheel_text = pro.getProperty("silvertraq_spinwheel_text");
		return silvertraq_spinwheel_text;
	}
	public String getloveco_iframe() {
		String loveco_iframe = pro.getProperty("loveco_iframe");
		return loveco_iframe;
	}
	public String getloveco_iframe_close() {
		String loveco_iframe_close = pro.getProperty("loveco_iframe_close");
		return loveco_iframe_close;
	}
	public String geturbanjungle_addtocart() {
		String urbanjungle_addtocart = pro.getProperty("urbanjungle_addtocart");
		return urbanjungle_addtocart;
	}
	public String geturbanjungle_proceedtocheckout() {
		String urbanjungle_proceedtocheckout = pro.getProperty("urbanjungle_proceedtocheckout");
		return urbanjungle_proceedtocheckout;
	}
	public String geturbanjungle_popupclose() {
		String urbanjungle_popupclose = pro.getProperty("urbanjungle_popupclose");
		return urbanjungle_popupclose;
	}
	public String gettrueelements_addtocart() {
		String trueelements_addtocart = pro.getProperty("trueelements_addtocart");
		return trueelements_addtocart;
	}
	public String gettrueelements_placeorder() {
		String trueelements_placeorder = pro.getProperty("trueelements_placeorder");
		return trueelements_placeorder;
	}
	public String getweryze_ageconfrim() {
		String weryze_ageconfrim = pro.getProperty("weryze_ageconfrim");
		return weryze_ageconfrim;
	}
	public String getweryze_rewards_btn() {
		String weryze_rewards_btn = pro.getProperty("weryze_rewards_btn");
		return weryze_rewards_btn;
	}
	public String getweryze_rewards_iframe() {
		String weryze_rewards_iframe = pro.getProperty("weryze_rewards_iframe");
		return weryze_rewards_iframe;
	}
	public String getweryze_rewards_signin_btn() {
		String weryze_rewards_signin_btn = pro.getProperty("weryze_rewards_signin_btn");
		return weryze_rewards_signin_btn;
	}
	public String getwhatsup_wellness_hamburger() {
		String whatsup_wellness_hamburger = pro.getProperty("whatsup_wellness_hamburger");
		return whatsup_wellness_hamburger;
	}
	public String getwhatsup_wellness_login_btn() {
		String whatsup_wellness_login_btn = pro.getProperty("whatsup_wellness_login_btn");
		return whatsup_wellness_login_btn;
	}
	public String getMiGlow_buynow() {
		String MiGlow_buynow = pro.getProperty("MiGlow_buynow");
		return MiGlow_buynow;
	}
	public String getPuer_addtocart() {
		String Puer_addtocart = pro.getProperty("Puer_addtocart");
		return Puer_addtocart;
	}
	public String getPuer_ordernow() {
		String Puer_ordernow = pro.getProperty("Puer_ordernow");
		return Puer_ordernow;
	}
	public String getItalian_Colony_rewards_btn() {
		String Italian_Colony_rewards_btn = pro.getProperty("Italian_Colony_rewards_btn");
		return Italian_Colony_rewards_btn;
	}
	public String getItalian_Colony_rewards_signin_btn() {
		String Italian_Colony_rewards_signin_btn = pro.getProperty("Italian_Colony_rewards_signin_btn");
		return Italian_Colony_rewards_signin_btn;
	}
	public String getItalian_Colony_rewards_iframe() {
		String Italian_Colony_rewards_iframe = pro.getProperty("Italian_Colony_rewards_iframe");
		return Italian_Colony_rewards_iframe;
	}
	public String getHeelium_addtocart() {
		String Heelium_addtocart = pro.getProperty("Heelium_addtocart");
		return Heelium_addtocart;
	}
	public String getHeelium_upi_cash() {
		String Heelium_upi_cash = pro.getProperty("Heelium_upi_cash");
		return Heelium_upi_cash;
	}
	public String getSaadaa_selectsize() {
		String Saadaa_selectsize = pro.getProperty("Saadaa_selectsize");
		return Saadaa_selectsize;
	}
	public String getSaadaa_addtocart() {
		String Saadaa_addtocart = pro.getProperty("Saadaa_addtocart");
		return Saadaa_addtocart;
	}
	public String getSaadaa_placeorder() {
		String Saadaa_placeorder = pro.getProperty("Saadaa_placeorder");
		return Saadaa_placeorder;
	}
	public String getSaadaa_hamburger() {
		String Saadaa_hamburger = pro.getProperty("Saadaa_hamburger");
		return Saadaa_hamburger;
	}
	public String getSaadaa_kwikpass_btn() {
		String Saadaa_kwikpass_btn = pro.getProperty("Saadaa_kwikpass_btn");
		return Saadaa_kwikpass_btn;
	}
	public String getSaadaa_account_txt() {
		String Saadaa_account_txt = pro.getProperty("Saadaa_account_txt");
		return Saadaa_account_txt;
	}
	public String getSaadaa_popup_iframe() {
		String Saadaa_popup_iframe = pro.getProperty("Saadaa_popup_iframe");
		return Saadaa_popup_iframe;
	}
	public String getSaadaa_popup_close() {
		String Saadaa_popup_close = pro.getProperty("Saadaa_popup_close");
		return Saadaa_popup_close;
	}
	public String getGeniBags_rewards_btn() {
		String GeniBags_rewards_btn = pro.getProperty("GeniBags_rewards_btn");
		return GeniBags_rewards_btn;
	}
	public String getGeniBags_rewards_iframe() {
		String GeniBags_rewards_iframe = pro.getProperty("GeniBags_rewards_iframe");
		return GeniBags_rewards_iframe;
	}
	public String getGeniBags_rewards_signin_btn() {
		String GeniBags_rewards_signin_btn = pro.getProperty("GeniBags_rewards_signin_btn");
		return GeniBags_rewards_signin_btn;
	}
	public String getwhatsup_wellness_logout_btn() {
		String whatsup_wellness_logout_btn = pro.getProperty("whatsup_wellness_logout_btn");
		return whatsup_wellness_logout_btn;
	}
	public String gethokrewardsiframe() {
		String hokrewardsiframe = pro.getProperty("hokrewardsiframe");
		return hokrewardsiframe;
	}
	public String gethokrewardsbtniframe() {
		String hokrewardsbtniframe = pro.getProperty("hokrewardsbtniframe");
		return hokrewardsbtniframe;
	}
	public String gethokrewardsjoinnow() {
		String hokrewardsjoinnow = pro.getProperty("hokrewardsjoinnow");
		return hokrewardsjoinnow;
	}
	public String getnobero_logout_btn() {
		String nobero_logout_btn = pro.getProperty("nobero_logout_btn");
		return nobero_logout_btn;
	}
	public String getswissbeauty_reward_btn() {
		String swissbeauty_reward_btn = pro.getProperty("swissbeauty_reward_btn");
		return swissbeauty_reward_btn;
	}
	public String getswissbeauty_reward_iframe() {
		String swissbeauty_reward_iframe = pro.getProperty("swissbeauty_reward_iframe");
		return swissbeauty_reward_iframe;
	}
	public String getswissbeauty_reward_joinnow() {
		String swissbeauty_reward_joinnow = pro.getProperty("swissbeauty_reward_joinnow");
		return swissbeauty_reward_joinnow;
	}
	public String getnobero_iframe() {
		String nobero_iframe = pro.getProperty("nobero_iframe");
		return nobero_iframe;
	}
	public String getnobero_close_iframe() {
		String nobero_close_iframe = pro.getProperty("nobero_close_iframe");
		return nobero_close_iframe;
	}
	public String getgokwik_name_() {
		String gokwik_name_ = pro.getProperty("gokwik_name_");
		return gokwik_name_;
	}
	public String getweryze_spinwheel() {
		String weryze_spinwheel = pro.getProperty("weryze_spinwheel");
		return weryze_spinwheel;
	}
	public String getUrbangabru_addtocart() {
		String Urbangabru_addtocart = pro.getProperty("Urbangabru_addtocart");
		return Urbangabru_addtocart;
	}
	public String getUrbangabru_proceedtocheckout_btn() {
		String Urbangabru_proceedtocheckout_btn = pro.getProperty("Urbangabru_proceedtocheckout_btn");
		return Urbangabru_proceedtocheckout_btn;
	}
	public String getKrishnaayurvedbuynow() {
		String Krishnaayurvedbuynow = pro.getProperty("Krishnaayurvedbuynow");
		return Krishnaayurvedbuynow;
	}
	public String getKrishnaayurvedreward_btn() {
		String Krishnaayurvedreward_btn = pro.getProperty("Krishnaayurvedreward_btn");
		return Krishnaayurvedreward_btn;
	}
	public String getKrishnaayurvedreward_iframe() {
		String Krishnaayurvedreward_iframe = pro.getProperty("Krishnaayurvedreward_iframe");
		return Krishnaayurvedreward_iframe;
	}
	public String getKrishnaayurved_signin_btn() {
		String Krishnaayurved_signin_btn = pro.getProperty("Krishnaayurved_signin_btn");
		return Krishnaayurved_signin_btn;
	}
	public String getNurserylive_Pune_kp_icon() {
		String Nurserylive_Pune_kp_icon = pro.getProperty("Nurserylive_Pune_kp_icon");
		return Nurserylive_Pune_kp_icon;
	}
	public String getNurserylive_Pune_myaccount_btn() {
		String Nurserylive_Pune_myaccount_btn = pro.getProperty("Nurserylive_Pune_myaccount_btn");
		return Nurserylive_Pune_myaccount_btn;
	}
	public String getNurserylive_Pune_logout_btn() {
		String Nurserylive_Pune_logout_btn = pro.getProperty("Nurserylive_Pune_logout_btn");
		return Nurserylive_Pune_logout_btn;
	}
	public String getNurserylive_Punereward_btn() {
		String Nurserylive_Punereward_btn = pro.getProperty("Nurserylive_Punereward_btn");
		return Nurserylive_Punereward_btn;
	}
	public String getNurserylive_Pune_join_nowin_btn() {
		String Nurserylive_Pune_join_nowin_btn = pro.getProperty("Nurserylive_Pune_join_nowin_btn");
		return Nurserylive_Pune_join_nowin_btn;
	}
	public String getMyWishCare_closepopup() {
		String MyWishCare_closepopup = pro.getProperty("MyWishCare_closepopup");
		return MyWishCare_closepopup;
	}
}

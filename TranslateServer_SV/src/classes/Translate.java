package classes;

import java.net.URL;
import java.net.URLEncoder;

import com.rmtheis.yandtran.ApiKeys;
import com.rmtheis.yandtran.YandexTranslatorAPI;
import com.rmtheis.yandtran.language.Language;

/**
 * Makes calls to the Yandex machine translation web service API
 */
public final class Translate extends YandexTranslatorAPI {

  private static final String SERVICE_URL = "https://translate.yandex.net/api/v1.5/tr.json/translate?";
  private static final String TRANSLATION_LABEL = "text";

  //prevent instantiation
  public Translate(){};

  /**
   * Translates text from a given Language to another given Language using Yandex.
   * 
   * @param text The String to translate.
   * @param from The language code to translate from.
   * @param to The language code to translate to.
   * @return The translated String.
   * @throws Exception on error.
   */
  public static String execute(final String text, final Language from, final Language to) throws Exception {
    validateServiceState(text); 
    final String params = 
        PARAM_API_KEY + URLEncoder.encode(apiKey,ENCODING) 
        + PARAM_LANG_PAIR + URLEncoder.encode(from.toString(),ENCODING) + URLEncoder.encode("-",ENCODING) + URLEncoder.encode(to.toString(),ENCODING) 
        + PARAM_TEXT + URLEncoder.encode(text,ENCODING);
    final URL url = new URL(SERVICE_URL + params);
    return retrievePropArrString(url, TRANSLATION_LABEL).trim();
  }

  private static void validateServiceState(final String text) throws Exception {
    final int byteLength = text.getBytes(ENCODING).length;
    if(byteLength>10240) { // TODO What is the maximum text length allowable for Yandex?
      throw new RuntimeException("TEXT_TOO_LARGE");
    }
    validateServiceState();
  }
  
  public String translateText(String text){
    String rtrn = "Çeviri Başarısız.";
    try {
       Translate.setKey(ApiKeys.YANDEX_API_KEY);
       String[] parts = {"","",""};
       boolean from = true, to = false, txt = false;
       for(int i=0;i<text.length();i++){
           if(from){
               if(text.charAt(i) != '|')
                   parts[0]+=text.charAt(i);
               else{
                   from = false;
                   to = true;
               }
           }else if(to){
               if(text.charAt(i) != '|')
                   parts[1]+=text.charAt(i);
               else{
                   to = false;
                   txt = true;
               }
           }else if(txt){
                   parts[2]+=text.charAt(i);
           }
       }
       Language fromLang = findLang(parts[0]);
       Language toLang = findLang(parts[1]);
       if(fromLang!=null && toLang!=null)
           rtrn = Translate.execute(parts[2], fromLang, toLang);
    }catch (Exception e) {
      // TODO Auto-generated catch block
      //e.printStackTrace();
    }
    return rtrn;
  }
  
  public static Language findLang(String from){
      Language lang = null;
      switch(from){
        case "Albanian": lang = Language.ALBANIAN;break;
        case "Armenian": lang = Language.ARMENIAN;break;
        case "Azerbaijani": lang = Language.AZERBAIJANI;break;
        case "Belarusian": lang = Language.BELARUSIAN;break;
        case "Bulgarian": lang = Language.BULGARIAN;break;
        case "Catalan": lang = Language.CATALAN;break;
        case "Croatian": lang = Language.CROATIAN;break;
        case "Czech": lang = Language.CZECH;break;
        case "Danish": lang = Language.DANISH;break;
        case "Dutch": lang = Language.DUTCH;break;
        case "English": lang = Language.ENGLISH;break;
        case "Estonian": lang = Language.ESTONIAN;break;
        case "Finnish": lang = Language.FINNISH;break;
        case "French": lang = Language.FRENCH;break;
        case "German": lang = Language.GERMAN;break;
        case "Georgian": lang = Language.GEORGIAN;break;
        case "Greek": lang = Language.GREEK;break;
        case "Hungarian": lang = Language.HUNGARIAN;break;
        case "Italian": lang = Language.ITALIAN;break;
        case "Latvian": lang = Language.LATVIAN;break;
        case "Lithuanian": lang = Language.LITHUANIAN;break;
        case "Macedonian": lang = Language.MACEDONIAN;break;
        case "Norwegian": lang = Language.NORWEGIAN;break;
        case "Polish": lang = Language.POLISH;break;
        case "Portuguese": lang = Language.PORTUGUESE;break;
        case "Romanian": lang = Language.ROMANIAN;break;
        case "Russian": lang = Language.RUSSIAN;break;
        case "Serbian": lang = Language.SERBIAN;break;
        case "Slovak": lang = Language.SLOVAK;break;
        case "Slovenian": lang = Language.SLOVENIAN;break;
        case "Spanish": lang = Language.SPANISH;break;
        case "Swedish": lang = Language.SWEDISH;break;
        case "Turkish": lang = Language.TURKISH;break;
        case "Ukrainian": lang = Language.UKRAINIAN;break;
      }
      return lang;
  }
}


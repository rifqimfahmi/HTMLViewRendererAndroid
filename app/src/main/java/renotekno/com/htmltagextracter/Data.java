package renotekno.com.htmltagextracter;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zcabez on 23/08/2017.
 */

public class Data {
    // regex to match h2s and its child/innerHTML in the text
    public static final String H2_REGEX_MATCHER = "<[\\s*]?+h2[\\s*]?+>(.*?)<[\\s*]?+\\/h2[\\s*]?+>";

    // regex to match img tag <img/> and its src value as group 1
    public static final String IMG_REGEX_MATCHER = "<img\\s[^>]*?src\\s*=\\s*['\\\"]([^'\\\"]*?)['\\\"][^>]*?>";

    // regex to match li's tag <li> and match its child/innerHTML as group 2
    public static final String LI_REGEX_MATCHER = "[<](\\s+)?li[^>]*[>](.+?)[<](\\s+)?[\\/]?(\\s+)?li[^>]*[>]";
    // regex to match li's opening tag <li>
    public static final String LI_OPENING_REGEX_MATCHER = "[<](\\s+)?li[^>]*[>]";
    // regex to match li's closing tag </li>
    public static final String LI_CLOSING_REGEX_MATCHER = "[<](\\s+)?(/)(\\s+)?li[^>]*[>]";

    // regex to match br tags <br>
    public static final String BR_MATCHER = "[<](/)?br[^>]*[>]";

    public static final String NON_BREAKING_SPACES = "&nbsp;";

    // Loader id to create array of views
    public static final int LOADER_CREATE_VIEWS = 1;

    // tag for passing html body content in bundle to loader
    public static final String POST_CONTENT_TAG_BUNDLE = "post_content_tag_bundle";

    /**
     * Singleton variable for each post data
     * This variable will be interchangeably based on post to be loaded
     */

    // hold the images URL and the arrangement based on image position
    public static List<String> imagesSrc = new ArrayList<>();
    // image <img> wrapped in <a>
    public static List<String> imageLink = new ArrayList<>();

    // Array of views to be inflated
    public static List<View> viewToBeInflated = new ArrayList<>();
}

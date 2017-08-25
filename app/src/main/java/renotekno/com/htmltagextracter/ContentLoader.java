package renotekno.com.htmltagextracter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zcabez on 25/08/2017.
 */

public class ContentLoader extends AsyncTaskLoader<List<View>> {

    public static String HTMLDummy = "<div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://2.bp.blogspot.com/--TX3QH_tmFU/V7FGnP_teXI/AAAAAAAADe4/vbPzICw_-xcS2lmF2jjdfx2Bg5bhKp5UQCLcB/s1600/Renotekno_Hadir_di_Google_Play.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"286\" src=\"https://2.bp.blogspot.com/--TX3QH_tmFU/V7FGnP_teXI/AAAAAAAADe4/vbPzICw_-xcS2lmF2jjdfx2Bg5bhKp5UQCLcB/s640/Renotekno_Hadir_di_Google_Play.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"640\" /></a></div> Hi sobat renotekno setelah mempelajari pemrograman android selama 7 bulan dari berbagai macam sumber, mimin ingin membuat sebuah aplikasi android yang dapat diintegrasikan dengan blogger dan hal itu tercapai, kini kalian dapat mengakses konten renotekno melalui aplikasi android yang aplikasinya dapat kalian download melalui playstore secara gratis. Kalian juga dapat menemukan beberapa fitur tambahan yang tidak dapat kalian temukan di website langsung.<br /> <div style=\"text-align: center;\"> <a href=\"https://play.google.com/store/apps/details?id=net.renotekno.rifqi.renoteknobuild&amp;utm_source=global_co&amp;utm_medium=prtnr&amp;utm_content=Mar2515&amp;utm_campaign=PartBadge&amp;pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1\"><img alt=\"Get it on Google Play\" class=\"playstore-banner\" height=\"123\" src=\"https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png\" style=\"margin: 0px auto;\" width=\"320\" /></a></div> <h2> Mengenai Aplikasi Renotekno</h2> <div> Umumnya para blogger membuat aplikasi android untuk blog nya menggunakan WebView. Menggunakan WebView untuk pembuatan aplikasi android untuk blog sama saja seperti memuat sebuah website melalui mobile smartphone menggunakan browser. Kalian juga bisa lihat biasanya aplikasi yang seluruhnya menggunakan WebView tampilanya sama persis dengan tampilan versi mobile website tersebut. Metode ini tentunya menurut mimin kurang efektif karena user tetap menload semua javascript dan css yang ada sehingga meningkatkan waktu tunggu atau <i>load time </i>dari halaman tersebut<br /> <!-- Adsense --> Pada aplikasi android renotekno ini, mimin menggunakan Blogger API untuk mendapatkan data konten melalui server Blogger Google. Dengan menggunakan Blogger API maka para pengguna hanya memuat informasi - informasi penting saja seperti:<br /> <br /> <ul> <li>Judul pos</li> <li>Gambar pos</li> <li>Label pos</li> <li>Konten pos</li> <li>DLL</li> </ul> <div> Dengan begitu para user tidak perlu memuat file - file javascript ataupun CSS yang sangat banyak sehingga waktu tunggu bisa lebih cepat dibanding mengakses blog renotekno melalui website dan juga tidak terlalu memakan banyak bandwidth. Data yang diterima dari Blogger API berupa JSON dan kemudian mimin mengolah data tersebut agar dapat ditampilkan pada aplikasi. Bagi kalian yang belum mengenal JSON, JSON adalah (<i>javascript Object Notation</i>) yang biasanya merupakan sarana umum untuk mengirimkan informasi ke berbagai macam platform.<br /> <h2> Apa Saja Fiturnya ?</h2> </div> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://2.bp.blogspot.com/-rlJ0wvXGEy4/V7FZnjnGq-I/AAAAAAAADfI/TYqXLf_CqfsxjrnjDMzpP7hUogewp215QCLcB/s1600/Renotekno_Hadir_di_Google_Play_1.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"368\" src=\"https://2.bp.blogspot.com/-rlJ0wvXGEy4/V7FZnjnGq-I/AAAAAAAADfI/TYqXLf_CqfsxjrnjDMzpP7hUogewp215QCLcB/s640/Renotekno_Hadir_di_Google_Play_1.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"640\" /></a></div> <div> <br /></div> Untuk mengakses aplikasi ini tentunya pengguna membutuhkan koneksi internet untuk mendapatkan data dari server Blogger Google. Di halaman utama aplikasi renotekno terdapat 3 bagian yaitu <b>Artikel Pilihan</b>&nbsp;yang terdiri dari 5 artikel populer di blog renotekno ini.&nbsp;<b>Artikel Terbaru</b>&nbsp;yang terdiri dari 10 artikel terbaru sama seperti <i>recent posts</i>, dan <b>Kategori</b>&nbsp;untuk menampilkan daftar pos berdasarkan kategori atau label. Pada halaman utama juga terdapat fitur search pada bagian atas untuk melakukan pencarian pos.<br /> <br /> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://4.bp.blogspot.com/-YkiW_47Vzw4/V7FaaU8UI_I/AAAAAAAADfM/Sve_eo16Zyssv30eaBYUkX09Ev87VQZwACLcB/s1600/Renotekno_Hadir_di_Google_Play_2.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"400\" src=\"https://4.bp.blogspot.com/-YkiW_47Vzw4/V7FaaU8UI_I/AAAAAAAADfM/Sve_eo16Zyssv30eaBYUkX09Ev87VQZwACLcB/s400/Renotekno_Hadir_di_Google_Play_2.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"225\" /></a></div> Terdapat juga navigasi drawer yang dapat memudahkan pengguna menavigasi pada halaman yang ada. Adapun menu pada navigasi drawer diantaranya:<br /> <br /> <ul> <li><b>My Favorite</b>&nbsp;: Menampilkan pos favorite yang telah kalian tandai</li> <li><b>Semua Artikel</b>&nbsp;: Menampilkan semua daftar pos yang ada pada blog renotekno</li> <li><b>Visit Website</b>&nbsp;: Membuka website melalui browser</li> </ul> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://4.bp.blogspot.com/-nLETi0dXcSk/V7Fbo28u_EI/AAAAAAAADfg/Xg_Myc2KGTIrJje3BRS8m3ADffgURTJkgCLcB/s1600/Renotekno_Hadir_di_Google_Play_3.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"400\" src=\"https://4.bp.blogspot.com/-nLETi0dXcSk/V7Fbo28u_EI/AAAAAAAADfg/Xg_Myc2KGTIrJje3BRS8m3ADffgURTJkgCLcB/s400/Renotekno_Hadir_di_Google_Play_3.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"223\" /></a></div> <div> Gambar diatas merupakan tampilan ketika kalian membuka sebuah postingan. Terdapat tombol <b>share</b>, <b>refresh</b> dan tombol <b>back</b> pada bagian menu diatas. Ada juga tombol untuk memasukkan pos ini pada bagian favorite yang terdapat di pojok kanan bawah, tombol ini juga biasa disebut sebagai FAB ( <i>Floating Action Button</i> ). Pada bagian konten pos ini mimin menggunakan WebView untuk menampilkan nya. Kenapa mimin menggunakan WebView ? karena data konten pos terdapat tag HTML dan salah satu cara untuk menampilkanya itu menggunakan WebView.&nbsp;</div> <div> <br /></div> <div> Bisa saja dengan tidak menggunakan WebView tetapi caranya lumayan rumit, yaitu menggunakan RegEx atau bisa disebut (<i>&nbsp;Regular Exspression</i>&nbsp;) untuk memotong tag HTML dan mendapatkan teks nya saja dari konten tersebut. I am working on it !! :D</div> <div> <br /></div> <br /> Aplikasi renotekno juga masih belum begitu sempurna dan mimin berusaha untuk meningkatkanya agar lebih menarik dan memiliki fitur yang bermanfaat untuk para pembaca. Dimohon untuk memberikan kritik dan saranya pada aplikasi renotekno ini agar mimin mengetahui kekurangan dan kelebihanya. Terimakasih :D.</div> ";
    private List<String> splittedPostComponent = null;

    public static List<String> imagesSrc = new ArrayList<>();

    // image <img> wrapped in <a>
    private List<String> imageLink = new ArrayList<>();

    private List<View> viewToBeInflated = new ArrayList<>();
    
    public ContentLoader(Context context) {
        super(context);
        Log.d("WE_GOT_HERE", "Yes i am here contentLoader constrtuctor");
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public void onCanceled(List<View> data) {
        Log.d("WE_GOT_HERE", "Yes i am here onCanceled");
        super.onCanceled(data);
    }

    @Override
    public List<View> loadInBackground() {
        Log.d("WE_GOT_HERE", "Yes i am here loadInBackground");
        // preserve important HTML data
        doHTMLSelection();

        // Split cleaned HTML into arrays with <br> as delimiter
        splitHTMLIntoArrays();

        // create view for each splitted component
        if (splittedPostComponent != null && splittedPostComponent.size() > 0) {
            // loop through each component
            for (int i = 0; i < splittedPostComponent.size(); i++) {
                // create view if collection did not equal to empty string ""
                if (!splittedPostComponent.get(i).trim().equals("")) {
                    generateView_2(splittedPostComponent.get(i));
                }
            }
        }

        return viewToBeInflated;
    }

    private void generateView_2(String component) {
        // initiate matcher for component
        Matcher matcher = null;

        // Match <h2> tag and separate it if any
        matcher = Pattern.compile(Data.H2_REGEX_MATCHER).matcher(component);
        if (matcher.find()) {
            h2Detected(component, matcher);
            return;
        }

        // Match <img> tag and separate it if any
        matcher = Pattern.compile(Data.IMG_REGEX_MATCHER).matcher(component);
        if (matcher.find()) {
            imgDetected(matcher);
            return;
        }

        // inflate just normal text
        createParagraphView(component);
    }

    private void imgDetected(Matcher matcher) {
        String component;
        matcher.reset();

        // store src value if <img> exist
        while (matcher.find()) {
            imagesSrc.add(matcher.group(1));
        }

        // separate if the paragraph contain img
        // replace <img> with -+-img-+- to indicate image position in the text
        component = matcher.replaceAll("-+-img-+-");

        //split the delimiter to structure image position
        String[] imageStructure = component.split("-\\+-");

        // start looping the structured text
        int imageFoundIndex = 0;
        for (String structure : imageStructure) {
            // continue if the current index is not empty string ""
            if (!structure.trim().equals("")) {
                // create ImageView if current index value equeal to "img"
                if (structure.trim().equals("img")) {
                    createImageView();
                    imageFoundIndex++;
                } else {
                    // else create textView for the text
                    generateView_2(structure);
                }
            }
        }
    }

    private void h2Detected(String component, Matcher matcher) {
        matcher.reset();
        List<String> h2s = new ArrayList<>();

        while (matcher.find()) {
            // add h2 value if any
            h2s.add(Jsoup.parse(matcher.group(1)).text());
        }

        // replace h2 value with -+-h2-+- to split the string to find h2 position
        String markH2Position = component.replaceAll("<[\\s*]?+h2[\\s*]?+>.*?<[\\s*]?+\\/h2[\\s*]?+>", "-+-h2-+-");
        // split the paragraph with -+- as the delimiter
        String[] splittedH2 = markH2Position.split("-\\+-");

        int h2Found = 0;
        // loop through the splitted array
        for (String h2Place : splittedH2) {
            // if the value is not "" the create view either for h2 or paragraph
            if (!h2Place.trim().equals("")) {
                // if value is h2 create textview for h2
                if (h2Place.equals("h2")) {
                    // Create h2 view
                    createH2TextView(h2s.get(h2Found).trim());
                    // increase h2 position index after adding it to the view
                    h2Found++;

                    // add the h2 view to the viewgroup
//                    linearLayoutViewGroup.addView(h2View);

                } else {
                    // if not h2 create textview for paragraph
                    generateView_2(h2Place);
                }
            }
        }
    }

    private void createImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 16, 0, 16);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(layoutParams);
//        Glide.with(getContext()).load(imagesSrc.get(imageFoundIndex))
//                .into(imageView);
        viewToBeInflated.add(imageView);
    }

    @NonNull
    private void createH2TextView(String h2Val) {
        TextView h2View;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            h2View = new TextView(getContext(), null, 0, R.style.h2Style);
        } else {
            h2View = new TextView(getContext());
            LinearLayoutCompat.LayoutParams params = new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            h2View.setPadding(0, 12, 0, 22);
            h2View.setLayoutParams(params);
            h2View.setTextAppearance(getContext(), android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Large);
        }


        // set the h2 text TextView
        h2View.setText(h2Val);
        viewToBeInflated.add(h2View);
//        return h2View;
    }

    @NonNull
    private void createParagraphView(String bodyvalue) {
        Log.d("COMPONENT_INFO", "WE GOT HERE with value = " + bodyvalue);
        TextView textView;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            textView = new TextView(getContext(), null, 0, R.style.bodyText);
        } else {
            textView = new TextView(getContext());
            textView.setLayoutParams(new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setPadding(0, 0, 0, 28);
            textView.setTextAppearance(getContext(), android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Body1);
            textView.setLineSpacing(10f, 1f);
        }

        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(bodyvalue));
        viewToBeInflated.add(textView);
//        return textView;
    }

    @NonNull
    private void splitHTMLIntoArrays() {
        // split text into pharagraph as <br> is the delimiter
        String[] splitted = HTMLDummy.split("[<](/)?br[^>]*[>]");
        // create List of array that can be modified using linkedList
        List<String> splitted_list = new LinkedList<String>(Arrays.asList(splitted));
        // remove array index that contains empty string
        while (splitted_list.contains(" ")) {
            splitted_list.remove(" ");
        }
        splittedPostComponent = splitted_list;
    }

    private void doHTMLSelection() {
        // remove &nbsp; non-breaking space
        HTMLDummy = HTMLDummy.replaceAll("&nbsp;", " ");

        // preserve necessary tag for layout mapping
        preserveNecessaryTag();

        // if user use <p> instead of <br> we have to change the closing </p> with br and
        // remove the <p> tag
        // remove opening p tag
        HTMLDummy = HTMLDummy.replaceAll("[<](\\s+)?p[^>]*[>]", "");

        // replace closing p tag with <br> to indicate paragraph
        HTMLDummy = HTMLDummy.replaceAll("[<](\\s+)?(/)(\\s+)?p[^>]*[>]", "<br>");

        // remove <br /> tag inside <li> element
        removeBrInsidelist();

        // aa "- " to every element <li> at the start of the element
        HTMLDummy = HTMLDummy.replaceAll("[<](\\s+)?li[^>]*[>]", "- ");

        // replace closing tag </li> with </br> to separate with other list item
        HTMLDummy = HTMLDummy.replaceAll("[<](\\s+)?(/)(\\s+)?li[^>]*[>]", "<br>");

        // Remove <img> tag that wrapped in <a> tag
        removeAnchorWrappedImage();
    }

    private void removeBrInsidelist() {
        Matcher matcher = Pattern.compile("[<](\\s+)?li[^>]*[>](.+?)[<](\\s+)?[\\/]?(\\s+)?li[^>]*[>]").matcher(HTMLDummy);
        while (matcher.find()) {
            HTMLDummy = HTMLDummy.replace(matcher.group(2), matcher.group(2).replaceAll("[<](/)?br[^>]*[>]", ""));
        }
    }

    private void preserveNecessaryTag() {
        Whitelist whitelist = Whitelist.none();
        whitelist.addTags("br", "h2", "a", "img", "p", "b", "i", "pre", "li");
        whitelist.addAttributes("img", "src");
        whitelist.addProtocols("img", "src", "http", "https", "data", "cid");

        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http", "https", "data", "cid");
        whitelist.preserveRelativeLinks(true);
        HTMLDummy = Jsoup.clean(HTMLDummy, whitelist);
        Log.d("CHECK_OL", HTMLDummy);
    }

    // TODO : Remove <br> inside <li>
    private void removeAnchorWrappedImage() {
        Matcher matcher = Pattern.compile("([<](\\s+)?a[^>]*[>](\\s+)?([<](\\s+)?img[^>]*[>])(\\s+)?[<](\\s+)?[\\/]?(\\s+)?a[^>]*[>])").matcher(HTMLDummy);
        // extract the <img> only to array
        while (matcher.find()) {
            imageLink.add(matcher.group(4));
        }
        // reset matcher to the first for replacing wrapped <img> with <a> to <img> only
        matcher.reset();
        // loop through the <img> only array
        for (String image : imageLink) {
            // the loop will equivalent with the matcher find method index
            if (matcher.find()) {
                // replace the wrapped image which is in group 1 of the matcher
                // with the <img> only tag
                HTMLDummy = HTMLDummy.replace(matcher.group(1), image);
            }
        }
    }
}

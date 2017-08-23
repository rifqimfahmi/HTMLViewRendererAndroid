package renotekno.com.htmltagextracter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public class MainActivity extends AppCompatActivity {

    public static String HTMLDummy = "<!-- test --> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://2.bp.blogspot.com/-0Zcand6k8eI/WAhChvZjM7I/AAAAAAAADo4/fYFIf7o3o4A8b_GbR_QPAtYIM4WuKo1gQCLcB/s1600/cara_" +
            "membatasi_penggunaan_quota.jpg\" imageanchor=\"1\"><img alt=\"Cara Mebatasi Penggunaan Quota Data Internet Pada Android Smarthphone \" border=\"0\" height=\"380\" src=\"https://2.bp.blogspot.com/-0Zcand6" +
            "k8eI/WAhChvZjM7I/AAAAAAAADo4/fYFIf7o3o4A8b_GbR_QPAtYIM4WuKo1gQCLcB/s1600/cara_membatasi_penggunaan_quota.jpg\" title=\"Cara&nbsp;Mebatasi " +
            "Penggunaan Quota Data Internet Pada Android Smarthphone \" width=\"640\" /></a></div> Teknologi dari&nbsp;tahun ke tahun berkembang dengan sangat Salah satunya yaitu smartphone android. Seiring berkembangnya teknologi smartphone kita juga menjadi lebih banyak mengkonsumsi quota internet baik untuk update OS ataupun update software - software yang terinstall. Mungkin ada juga beberapa diantara kalian yang menggunakan WiFi dari ISP yang memiliki quota unlimited sehingga quota bukanlah permasalahan. Tapi bagaimana untuk yang memiliki quota terbatas ? berikut tips dan trik cara membatasi quota pada Android.<br /> <br /> Hampir semua perangkat android terdapat fitur&nbsp;<b>data usage</b>&nbsp;atau statistik penggunaan data internet. Pada fitur ini kalian dapat membatasi penggunaan quota internet per bulanya. Lokasi fitur ini bisa berbeda - beda pada tiap vendor android. Untuk android versi 4.4.2 Kitkat atau diatasnya pasti sudah mempunyai fitur ini.<br /> <!-- Adsense --> <br /> <h2> Cara mengatur penggunaan quota pada android per bulan</h2> <ol> <li>Buka <b>Settings</b>&nbsp;&gt; <b>Data Usage </b>atau <b>Pemakaian data seluler</b>.</li> <li>Kalian akan ditampilkan dengan 2 pilihan yaitu <b>Cellular data</b>&nbsp;dan <b>Set cellular data limit</b>. Pada kotak merah digunakan untuk mengatur periode per bulan.<div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://3.bp.blogspot.com/-xe3IUUFX2ug/WAhQIkCydMI/AAAAAAAADpM/pzwU5KHLvKofQAgJTZ2wve9cV9OniOFLgCLcB/s1600/cara_membatasi_penggunaan_quota_1.jpg\" imageanchor=\"1\" style=\"font-weight: bold; margin-left: 1em; margin-right: 1em;\"><img alt=\"Cara Mebatasi Penggunaan Quota Data Internet Pada Android Smarthphone \" border=\"0\" height=\"400\" src=\"https://3.bp.blogspot.com/-xe3IUUFX2ug/WAhQIkCydMI/AAAAAAAADpM/pzwU5KHLvKofQAgJTZ2wve9cV9OniOFLgCLcB/s400/cara_membatasi_penggunaan_quota_1.jpg\" title=\"Cara Mebatasi Penggunaan Quota Data Internet Pada Android Smarthphone \" width=\"225\" /></a></div> <div style=\"text-align: left;\"> <b>Cellular data</b>&nbsp;digunakan untuk menyalakan atau mematikan data internet. Untuk membatasi penggunaan data internet, aktifkan pilah <b>Set cellular data limit</b>.&nbsp;</div> </li> <li><div style=\"text-align: left;\"> Dapat kalian lihat pada gambar di atas pada kotak merah digunakan untuk mengatur tanggal yang diinginkan. Misal kalian baru membeli quota tanggal 15 Oktober maka klik pada tanggal pada kotak merah dan pilih <b>change cycle</b>.<br /> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://1.bp.blogspot.com/-wVDrNo21_fU/WAhSDhvSPwI/AAAAAAAADpU/TkExIlEMdm425xMbwmEVNnfCNps9HxrgACLcB/s1600/cara_membatasi_penggunaan_quota_2.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"Cara Mebatasi Penggunaan Quota Data Internet Pada Android Smarthphone \" border=\"0\" height=\"284\" src=\"https://1.bp.blogspot.com/-wVDrNo21_fU/WAhSDhvSPwI/AAAAAAAADpU/TkExIlEMdm425xMbwmEVNnfCNps9HxrgACLcB/s320/cara_membatasi_penggunaan_quota_2.jpg\" title=\"Cara Mebatasi Penggunaan Quota Data Internet Pada Android Smarthphone \" width=\"320\" /></a></div> <div style=\"text-align: left;\"> Pilih tanggal 15 atau tanggal pembelian quota kalian dan klik <b>SET</b>.<br /> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://1.bp.blogspot.com/-mH4nHioxZzE/WAhSuleKwhI/AAAAAAAADpY/2wCmpFN8Dd4_NAH523QdOl8mNfWodVdsQCLcB/s1600/cara_membatasi_penggunaan_quota_3.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"Cara Mebatasi Penggunaan Quota Data Internet Pada Android Smarthphone \" border=\"0\" height=\"284\" src=\"https://1.bp.blogspot.com/-mH4nHioxZzE/WAhSuleKwhI/AAAAAAAADpY/2wCmpFN8Dd4_NAH523QdOl8mNfWodVdsQCLcB/s320/cara_membatasi_penggunaan_quota_3.jpg\" title=\"Cara Mebatasi Penggunaan Quota Data Internet Pada Android Smarthphone \" width=\"320\" /></a></div> <div style=\"text-align: left;\"> maka android akan otomatis mengatur tanggal untuk 1 bulan kedepan. Selama satu bulan itulah data yang kalian gunakan akan ditampilkan dalam bentuk grafik</div> </div> </div> </li> <li><div style=\"text-align: left;\"> Untuk mengatur penggunaan quota dapat kalian lihat pada grafik terdapat 2 garis berwarna <b>abu - abu</b>&nbsp;dan <b>merah</b>. Garis yang berwarna abu - abu berfungsi untuk memberikan peringatan terhadap penggunaan data tertentu yang biasanya muncul pada panel notifikasi. Sedangkan garis yang berwarna merah berfungsi untuk mematikan data internet jika sudah mencapai batas tertentu.<br /> <br /> Untuk mengatur penggunaan quota kalian hanya perlu menggerakkan garis abu - abu atau merah tersebut sesuai dengan yang kalian inginkan. Perlu kalian ketahui bahwa garis merah akan selalu berada di atas garis abu - abu.</div> </li> </ol> <div> Nah begitulah cara mengatur penggunaan quota data internet per bulanya. Mungkin pada hp android kalian memiliki tampilan yang berbeda dengan screenshot yang mimin berikan, itu disebabkan karena tiap vendor android memiliki style yang berbeda - beda. Tetapi intinya sama, untuk mengatur penggunaan data internet biasanya terdapat pada menu <b>Data usage</b>&nbsp;atau <b>Penggunaan data</b>. Bahkan ada juga vendor android yang memiliki fitur pembatasan penggunaan quota data internet per harinya.<br /> <br /></div> ";
    private List<String> splittedPostComponent = null;
    private static List<String> imageLink = new ArrayList<>();

    // a viewGroup of the layout
    private LinearLayout linearLayoutViewGroup;

    private static List<View> viewToBeInflated = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

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
        linearLayoutViewGroup.addView(createParagraphView(component));
    }

    private void imgDetected(Matcher matcher) {
        String component;
        matcher.reset();
        List<String> imagesSrc = new ArrayList<>();

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
                    createImageView(imagesSrc, imageFoundIndex);
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
                    TextView h2View = createH2TextView(h2s.get(h2Found).trim());

                    // add the h2 view to the viewgroup
                    linearLayoutViewGroup.addView(h2View);

                    // increase h2 position index after adding it to the view
                    h2Found++;
                } else {
                    // if not h2 create textview for paragraph
                    generateView_2(h2Place);
                }
            }
        }
    }

    private void createImageView(List<String> imagesSrc, int imageFoundIndex) {
        ImageView imageView = new ImageView(this);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 16, 0, 16);
        imageView.setLayoutParams(layoutParams);
        Log.d("IMAGE_ADDRESS", imagesSrc.size() + "");
        Glide.with(this).load(imagesSrc.get(imageFoundIndex))
                .into(imageView);
        linearLayoutViewGroup.addView(imageView);
    }

    @NonNull
    private TextView createH2TextView(String h2Val) {
        TextView h2View;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            h2View = new TextView(this, null, 0, R.style.h2Style);
        } else {
            h2View = new TextView(this);
            LinearLayoutCompat.LayoutParams params = new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            h2View.setPadding(0, 12, 0, 22);
            h2View.setLayoutParams(params);
            h2View.setTextAppearance(this, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Large);
        }


        // set the h2 text TextView
        h2View.setText(h2Val);
        return h2View;
    }

    @NonNull
    private TextView createParagraphView(String bodyvalue) {
        Log.d("COMPONENT_INFO", "WE GOT HERE with value = " + bodyvalue);
        TextView textView;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            textView = new TextView(this, null, 0, R.style.bodyText);
        } else {
            textView = new TextView(this);
            textView.setLayoutParams(new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setPadding(0, 0, 0, 28);
            textView.setTextAppearance(this, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Body1);
            textView.setLineSpacing(10f, 1f);
        }

        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(bodyvalue));
        return textView;
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

        // Remove <img> tag that wrapped in <a> tag
        removeAnchorWrappedImage();
    }

    private void preserveNecessaryTag() {
        Whitelist whitelist = Whitelist.none();
        whitelist.addTags("br", "h2", "a", "img", "p", "ul", "ol", "li", "b", "i");
        whitelist.addAttributes("img", "src");
        whitelist.addProtocols("img", "src", "http", "https", "data", "cid");

        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http", "https", "data", "cid");
        whitelist.preserveRelativeLinks(true);
        HTMLDummy = Jsoup.clean(HTMLDummy, whitelist);
    }

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

    private void initView() {
        linearLayoutViewGroup = (LinearLayout) findViewById(R.id.linearLayoutViewGroup);
    }
}

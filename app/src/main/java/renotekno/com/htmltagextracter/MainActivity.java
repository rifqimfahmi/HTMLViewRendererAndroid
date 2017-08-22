package renotekno.com.htmltagextracter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    public static String HTMLDummy = "<div class=\"separator\" style=\"clear: both; text-align: center;\"> </div> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://2.bp.blogspot.com/-Preop1ERsYk/WLuYtj-XjvI/AAAAAAAADyw/OIwz0ARU09gavfappI9ph7q663NuYwvYgCLcB/s1600/cara_optimasi_seo_pada_blogger_1.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"Cara Optimasi SEO Pada Blog\" border=\"0\" height=\"320\" src=\"https://2.bp.blogspot.com/-Preop1ERsYk/WLuYtj-XjvI/AAAAAAAADyw/OIwz0ARU09gavfappI9ph7q663NuYwvYgCLcB/s320/cara_optimasi_seo_pada_blogger_1.jpg\" title=\"Cara Optimasi SEO Pada Blog\" width=\"320\" /></a></div> Setiap orang yang mempunyai blog atau website pasti berkeinginan agar blognya dapat muncul pada halaman pertama dan urutan pertama di mesin pecarian agar mendapatkan lebih banyak pengunjung atau pembaca. Tetapi untuk menjadi yang pertama juga tidak mudah. Banyak blog - blog lain yang tentunya ingin juga menjadi yang pertama. Oleh karena itu kita harus mengoptimalkan pencarian blog kita pada search engine atau bisa disbut juga SEO.<br /> <br /> Apa itu SEO ? SEO ( <i>Search Engine Optimizer</i>&nbsp;) adalah sebuah metode / teknik /strategi yang digunakan untuk meningkatkan jumlah pengunjung dengan mendapatkan ranking yang tinggi pada hasil pencarian search engine atau SERP ( <i>Search Engine Result Page&nbsp;</i>). Jadi selain membuat website kita juga harus tau bagaimana melakukan SEO pada blog kita. Ada beberapa cara untuk melakukan SEO pada blog diantaranya:<br /> <!-- Adsense --> <br /> <h2> Buat artikel original</h2> <div> Ini adalah hal yang sangat penting untuk dilakukan. Kita harus membuat artikel original artinya artikel yang kita buat adalah buatan kita sendiri bukan artikel blog atau website lain yang di copas ( <i>copy paste</i> ). Kalian harus membuat artikel se kreatif mungkin agar pembaca tertarik dengan apa yang kalian sampaikan. Buatlah artikel <b>minimal </b>300 kata, lebih banyak lebih baik.</div> <div> <br /></div> <div> Kenapa ini sangat penting ? yup jika search engine mendeteksi bahwa artikel kalian adalah artikel jiplakan dari website lain maka search engine bisa saja menganggap blog kalian sebagai spam dengan begitu kalian akan mendapatkan ranking yang kecil dan susah untuk mencapai halaman pertama pada seaerch engine. Kasus paling buruknya adalah blog kalian di blokir oleh search engine.</div> <h2> Deskirpsi artikel yang singkat, padat, dan jelas</h2> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://1.bp.blogspot.com/-FNsu_jWyMoM/WL4SoLLPZXI/AAAAAAAADzU/5c6OOazqkl02FT5GqIaa15aOYsmcQ4yDwCLcB/s1600/cara_optimasi_seo_pada_blogger_2.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"Cara Optimasi SEO Pada Blog\" border=\"0\" height=\"90\" src=\"https://1.bp.blogspot.com/-FNsu_jWyMoM/WL4SoLLPZXI/AAAAAAAADzU/5c6OOazqkl02FT5GqIaa15aOYsmcQ4yDwCLcB/s640/cara_optimasi_seo_pada_blogger_2.jpg\" title=\"Cara Optimasi SEO Pada Blog\" width=\"640\" /></a></div> <div> <br /></div> <div> Selain artikel yang original kita juga harus membuat deskripsi artikel tersebut singkat padat dan jelas. Deskripsi ini adalah bagian yang akan di tampilkan pada search engine. Buatlah deskripsi minimal sepanjang 150 karakter. Deskripsi yang baik akan sesuai dengan apa yang ingin ditemukan oleh pengunjung dalam artikel yang kita buat.</div> <h2> Gunakan keyword dengan benar</h2> <div> Keyword atau kata kunci adalah kata yang kalian fokuskan pada blog kalian. Misal kalian mempunyai blog yang membicarakan mengenai android. Deskripsi dari blog kalian harus terdapat kata 'android' di dalamnya. Kemudian pada artikel, misal kalian ingin menargetkan keyword 'cara reset android' pastikan pada judul, isi, dan deskripsi terdapat kata kunci tersebut.</div> <div> <br /></div> <div> Memang kita dapat memiliki banyak topik di blog kita, tetapi lebih baik jika kita fokus pada satu topik saja. Blog yang memiliki banyak topik biasanya disebut blog gado - gado.</div> <h2> Buat blog responsif ( Mobile-Friendly )</h2> <div> Mobile-friendly berarti bagus disegala ukuran layar. Pada jaman sekarang hampir setiap orang mempunyai handphone / smarthphone yang bisa mereka bawa kemana - mana. Membuat blog Mobile-Friendly juga sangat penting karena para pembaca blog tidak hanya menggunakan PC atau laptop tetapi juga menggunakan handphone yang mereka miliki. Blog yang mobile-friendly akan memudahkan pengguna dalam menavigasi blog kita pada layar yang kecil seperti smartphone.</div> <div> <br /></div> <div> Selain memudahkan pengguna dalam menavigasi, mobile-friendly juga menjadi pertimbangan search engine. Jika blog saingan kalian sudah mobile-friendly dan kalian belum maka search engine akan menampilkan yang mobile-friendly terlebih dahulu. Untuk lebih lengkapnya kalian bisa membaca artikel saya sebelumnya&nbsp;<a href=\"http://www.renotekno.net/2016/06/pentingnya-membuat-website-responsif.html\" target=\"_blank\">Pentingnya Membuat Website Responsive</a>.&nbsp;</div> <div> <br /></div> <div> Untuk cek apakah blog kalian responsif atau tidak kalian bisa menggunakan tool yang telah disediakan oleh google:&nbsp;<a href=\"https://search.google.com/search-console/mobile-friendly\" target=\"_blank\">mobile-friendly tester</a></div> <h2> Gunakan Heading Tag dengan benar</h2> <div> Penggunaan heading tag berfungsi untuk memberi penekanan pada suatau kata / kalimat. Misal hedaing tag <b>&lt;h1&gt;&lt;/h1&gt; </b>biasa digunakan untuk memberikan judul halaman dan heading tag <b>&lt;h2&gt;&lt;/h2&gt;</b>&nbsp;biasa digunakan pada subjudul yang berhubungan dengan judul dan begitu juga seterusnya untuk h3, h4, h5, dan h6.</div> <div> <br /></div> <div> Penggunaan tag berfungsi untuk memudahkan search engine memahami isi dari artikel yang kalian buat.</div> <h2> Gunakan attribute 'alt' pada gambar</h2> <div> Kita harus menggunakan attribute 'alt' pada setiap gambar. Isi dari alt sendiri ialah hal mengenai gambar tersebut contoh&nbsp;<b>&lt;img src='gambar_gedung.jpg' alt='Gambar gedung'&gt;</b>. Sebagai manusia tentunya kita dapat menebak apa gambar yang kita lihat seperti gambar bangunan atau gambar binatang dan sebagainya. Tetapi search engine tidak dapat mengenalinya, oleh karena itu kita membutuhkan attribute alt untuk memudahkan search engine mengenali gambar tersebut. Jika kalian tidak memakai attribute alt pada sebuah gambar maka search engine akan bertanya - tanya <b>gambar apa sih ini</b> ?</div> <h2> Blogwalking</h2> <div> Blogwalking maksudnya adalah kita berkunjung ke blog orang lain untuk bersilaturahmi. Cara blogwalking sangatlah gampang, kalian bisa dengan mengunjungi blog orang lain dan membaca artikelnya kemudian memberikan feedback atau komentar yang relevan dengan artikel tersebut jangan mencantumkan link aktif. Cantumkan nama dan url blog atau artikel kalian pada form masing - masing. Dengan begitu pembuat blog juga bisa mengunjungi blog kalian. Dengan blogwalking, kalian juga bisa mendapatkan backlink yang positif.&nbsp;</div> <h2> Tingkatkan backlink</h2> <div> Backlink adalah sebuah link yang berada pada blog / website lain yang mengarah ke blog kita. Backlink dapat meningkatkan ranking blog pada SERP karena search engine mengira bahwa blog kita mempunyai pengaruh pada artikel blog lain tersebut. Buatlah backlink pada blog / website yang sesuai dengan topik blog kita. Jangan menggunakan backlink generator atau blog kalian bisa dianggap spam oleh search engine.</div> <h2> Buat daftar isi</h2> <div> Daftar isi berisi artikel - artikel yang telah kalian buat. Daftar isi bertujuan agar pengunjung dapat melihat artikel - artikel tersebut. Selain bertujuan mempermudah, daftar isi juga dapat meningkatkan jumah pageview pada blog kalian karena pengunjung bisa saja tertarik pada artikel - artikel sebelumnya.</div> <h2> Flexibel</h2> <div> Maksud dari flexibel disini adalah pengguna dapat mengunjungi setiap halaman atau artikel yang kalian buat seperti halaman kontak, daftar isi, disclaimer, dll. Flexibel ini juga merupakan syarat agar blog kalian bisa di monetize dengan google adsense.&nbsp;</div> <h2> Buat Blog secepat mungkin</h2> <div> Maksud cepat disini adalah cepat dalam menload blog atau waktu tunggu pengguna dalam memuat halaman blog. Kecepatan memuat juga menjadi pertimbangan search engine dalam melakukan perankingan website. Semakin cepat waktu tunggu blog kalian maka semakin tinggi juga kesempatan kalian menjadi yang pertama. Beberapa tips dari mimin agar waktu tunggu blog sangat kecil:&nbsp;</div> <div> <ol> <li>Jangan menggunakan gambar yang berlebihan. Gambar merupakan file yang memiliki ukuran paling besar dibanding text. Semakin besar ukuran gambar maka semakin lama pula waktu tunggu blog kalian.</li> <li>Jangan menggunakan widget berlebihan.&nbsp;</li> <li>Gunakan Javascript secukupnya.</li> </ol> <div> Tool untuk test waktu tunggu blog:&nbsp;<a href=\"https://tools.pingdom.com/\" target=\"_blank\">https://tools.pingdom.com/</a></div> </div> <div> <br /></div> <div> Metode Blogwalking dan backlink disebut SEO off-page artinya optimisasi SEO diluar blog, yang lainya disebut SEO on-page karena optimisasi dilakukan di blog kita sendiri. Yup itulah beberapa cara dalam optimasi SEO pada blog. Apakah blog kalian sudah memenuhih kriteria tersebut ? hehe</div> ";
    private List<String> splitted_post = null;
    private static List<String> imageLink = new ArrayList<>();
    private LinearLayout linearLayoutViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        Whitelist whitelist = Whitelist.none();
        whitelist.addTags("br", "h2");
        String cleaner = Jsoup.clean(HTMLDummy, whitelist);

        /* Split the post with the <br> to indicate spacing with regex [<](/)?br[^>]*[>] */
//        String replace_br = cleaner.replaceAll("[<](/)?br[^>]*[>]", "\n");
//        replace_br = replace_br.replaceAll("[<](\\s+)?[/]?(\\s+)?div[^>]*[>]", "");

        splitted_post = splitFromBr();
        generateviewEachText();

    }

    private void generateviewEachText() {
        if (splitted_post != null) {
            for (String post : splitted_post) {
                // create view if collection did not equal to empty string ""
                if (!post.trim().equals("")) {
                    // hold h2 value
                    List<String> h2s = new ArrayList<>();

                    // extract h2 for each component
                    Pattern pattern = Pattern.compile("<[\\s*]?+h2[\\s*]?+>(.*?)<[\\s*]?+\\/h2[\\s*]?+>");
                    Matcher matcher = pattern.matcher(post);

                    while (matcher.find()) {
                        // add h2 value if any
                        h2s.add(Jsoup.parse(matcher.group(1)).text());
                    }

                    // check if there is h2 tag in the pharagraph
                    if (h2s.size() > 0) {
                        // replace h2 value with -+-h2-+- to split the string to find h2 position
                        String strippedH2 = post.replaceAll("<[\\s*]?+h2[\\s*]?+>.*?<[\\s*]?+\\/h2[\\s*]?+>", "-+-h2-+-");
                        // split the paragraph with -+- as the delimiter
                        String[] strippedH2Array = strippedH2.split("-\\+-");

                        // initiate h2 position to 0
                        int h2Found = 0;
                        // loop through the splitted array
                        for (String h2Place : strippedH2Array) {
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
                                    createNotH2View(h2Place);
                                }
                            }
                        }

                    } else {
                        // if there is no h2 on the paragraph create create textview and append it to viewgroup
                        createNotH2View(post);
                    }
                }
            }
        }
    }

    private void createNotH2View(String h2Place) {
        if (!h2Place.trim().equals("")) {
            // match img tag
            Pattern pattern = Pattern.compile("<img\\s[^>]*?src\\s*=\\s*['\\\"]([^'\\\"]*?)['\\\"][^>]*?>");
            Matcher matcher = pattern.matcher(h2Place);

            List<String> imagesSrc = null;
            // create array to store img src value
            imagesSrc = new ArrayList<>();

            // store src value if <img> exist
            while (matcher.find()) {
                imagesSrc.add(matcher.group(1));
            }

            // separate if the paragraph contain img
            if (imagesSrc.size() > 0) {
                Log.d("IMAGE_ADDRESS", h2Place + "");
                // replace <img> with -+-img-+- to indicate image position in the text
                h2Place = matcher.replaceAll("-+-img-+-");

                //split the delimiter to structure image position
                String[] imageStructure = h2Place.split("-\\+-");

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
                            linearLayoutViewGroup.addView(createParagraphView(structure));
                        }
                    }
                }
            } else {
                // if no <img> just append it to viewgroup
                TextView textView = createParagraphView(h2Place);
                linearLayoutViewGroup.addView(textView);
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
            LinearLayoutCompat.LayoutParams params =  new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
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
    private List<String> splitFromBr() {
        // remove div tag
        HTMLDummy = HTMLDummy.replaceAll("[<](\\s+)?[/]?(\\s+)?div[^>]*[>]", "");

        // remove opening p tag
        HTMLDummy = HTMLDummy.replaceAll("[<](\\s+)?p[^>]*[>]", "");

        // replace closing p tag with <br> to indicate paragraph
        HTMLDummy = HTMLDummy.replaceAll("[<](\\s+)?(/)(\\s+)?p[^>]*[>]", "<br>");

        // remove anchor tag that wrapped img
        Matcher matcher = Pattern.compile("([<](\\s+)?a[^>]*[>](\\s+)?([<](\\s+)?img[^>]*[>])(\\s+)?[<](\\s+)?[\\/]?(\\s+)?a[^>]*[>])").matcher(HTMLDummy);
        while (matcher.find()){
            imageLink.add(matcher.group(4));
        }

        matcher.reset();
        for (String image : imageLink) {
            if (matcher.find()) {
                HTMLDummy = HTMLDummy.replace(matcher.group(1), image);
            }
        }

        // Remove all comment
        HTMLDummy = HTMLDummy.replaceAll("<!--[^>]*-->", "");

        // remove &nbsp; non-breaking space
        HTMLDummy = HTMLDummy.replaceAll("&nbsp;", " ");

        // split text into pharagraph as <br> is the delimiter
        String[] splitted = HTMLDummy.split("[<](/)?br[^>]*[>]");
        List<String> splitted_list = new LinkedList<String>(Arrays.asList(splitted));
        while (splitted_list.contains(" ")) {
            splitted_list.remove(" ");
        }
        for (String split : splitted_list) {
//            Log.d("SPLITTED_STRING", split + "");
        }
        return splitted_list;
    }

    private void initView() {
        linearLayoutViewGroup = (LinearLayout) findViewById(R.id.linearLayoutViewGroup);
    }
}

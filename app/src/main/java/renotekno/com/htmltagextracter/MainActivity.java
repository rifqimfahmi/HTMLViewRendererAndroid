package renotekno.com.htmltagextracter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
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

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<View>>{

    public static String HTMLDummy = "<div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://2.bp.blogspot.com/--TX3QH_tmFU/V7FGnP_teXI/AAAAAAAADe4/vbPzICw_-xcS2lmF2jjdfx2Bg5bhKp5UQCLcB/s1600/Renotekno_Hadir_di_Google_Play.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"286\" src=\"https://2.bp.blogspot.com/--TX3QH_tmFU/V7FGnP_teXI/AAAAAAAADe4/vbPzICw_-xcS2lmF2jjdfx2Bg5bhKp5UQCLcB/s640/Renotekno_Hadir_di_Google_Play.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"640\" /></a></div> Hi sobat renotekno setelah mempelajari pemrograman android selama 7 bulan dari berbagai macam sumber, mimin ingin membuat sebuah aplikasi android yang dapat diintegrasikan dengan blogger dan hal itu tercapai, kini kalian dapat mengakses konten renotekno melalui aplikasi android yang aplikasinya dapat kalian download melalui playstore secara gratis. Kalian juga dapat menemukan beberapa fitur tambahan yang tidak dapat kalian temukan di website langsung.<br /> <div style=\"text-align: center;\"> <a href=\"https://play.google.com/store/apps/details?id=net.renotekno.rifqi.renoteknobuild&amp;utm_source=global_co&amp;utm_medium=prtnr&amp;utm_content=Mar2515&amp;utm_campaign=PartBadge&amp;pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1\"><img alt=\"Get it on Google Play\" class=\"playstore-banner\" height=\"123\" src=\"https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png\" style=\"margin: 0px auto;\" width=\"320\" /></a></div> <h2> Mengenai Aplikasi Renotekno</h2> <div> Umumnya para blogger membuat aplikasi android untuk blog nya menggunakan WebView. Menggunakan WebView untuk pembuatan aplikasi android untuk blog sama saja seperti memuat sebuah website melalui mobile smartphone menggunakan browser. Kalian juga bisa lihat biasanya aplikasi yang seluruhnya menggunakan WebView tampilanya sama persis dengan tampilan versi mobile website tersebut. Metode ini tentunya menurut mimin kurang efektif karena user tetap menload semua javascript dan css yang ada sehingga meningkatkan waktu tunggu atau <i>load time </i>dari halaman tersebut<br /> <!-- Adsense --> Pada aplikasi android renotekno ini, mimin menggunakan Blogger API untuk mendapatkan data konten melalui server Blogger Google. Dengan menggunakan Blogger API maka para pengguna hanya memuat informasi - informasi penting saja seperti:<br /> <br /> <ul> <li>Judul pos</li> <li>Gambar pos</li> <li>Label pos</li> <li>Konten pos</li> <li>DLL</li> </ul> <div> Dengan begitu para user tidak perlu memuat file - file javascript ataupun CSS yang sangat banyak sehingga waktu tunggu bisa lebih cepat dibanding mengakses blog renotekno melalui website dan juga tidak terlalu memakan banyak bandwidth. Data yang diterima dari Blogger API berupa JSON dan kemudian mimin mengolah data tersebut agar dapat ditampilkan pada aplikasi. Bagi kalian yang belum mengenal JSON, JSON adalah (<i>javascript Object Notation</i>) yang biasanya merupakan sarana umum untuk mengirimkan informasi ke berbagai macam platform.<br /> <h2> Apa Saja Fiturnya ?</h2> </div> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://2.bp.blogspot.com/-rlJ0wvXGEy4/V7FZnjnGq-I/AAAAAAAADfI/TYqXLf_CqfsxjrnjDMzpP7hUogewp215QCLcB/s1600/Renotekno_Hadir_di_Google_Play_1.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"368\" src=\"https://2.bp.blogspot.com/-rlJ0wvXGEy4/V7FZnjnGq-I/AAAAAAAADfI/TYqXLf_CqfsxjrnjDMzpP7hUogewp215QCLcB/s640/Renotekno_Hadir_di_Google_Play_1.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"640\" /></a></div> <div> <br /></div> Untuk mengakses aplikasi ini tentunya pengguna membutuhkan koneksi internet untuk mendapatkan data dari server Blogger Google. Di halaman utama aplikasi renotekno terdapat 3 bagian yaitu <b>Artikel Pilihan</b>&nbsp;yang terdiri dari 5 artikel populer di blog renotekno ini.&nbsp;<b>Artikel Terbaru</b>&nbsp;yang terdiri dari 10 artikel terbaru sama seperti <i>recent posts</i>, dan <b>Kategori</b>&nbsp;untuk menampilkan daftar pos berdasarkan kategori atau label. Pada halaman utama juga terdapat fitur search pada bagian atas untuk melakukan pencarian pos.<br /> <br /> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://4.bp.blogspot.com/-YkiW_47Vzw4/V7FaaU8UI_I/AAAAAAAADfM/Sve_eo16Zyssv30eaBYUkX09Ev87VQZwACLcB/s1600/Renotekno_Hadir_di_Google_Play_2.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"400\" src=\"https://4.bp.blogspot.com/-YkiW_47Vzw4/V7FaaU8UI_I/AAAAAAAADfM/Sve_eo16Zyssv30eaBYUkX09Ev87VQZwACLcB/s400/Renotekno_Hadir_di_Google_Play_2.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"225\" /></a></div> Terdapat juga navigasi drawer yang dapat memudahkan pengguna menavigasi pada halaman yang ada. Adapun menu pada navigasi drawer diantaranya:<br /> <br /> <ul> <li><b>My Favorite</b>&nbsp;: Menampilkan pos favorite yang telah kalian tandai</li> <li><b>Semua Artikel</b>&nbsp;: Menampilkan semua daftar pos yang ada pada blog renotekno</li> <li><b>Visit Website</b>&nbsp;: Membuka website melalui browser</li> </ul> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <a href=\"https://4.bp.blogspot.com/-nLETi0dXcSk/V7Fbo28u_EI/AAAAAAAADfg/Xg_Myc2KGTIrJje3BRS8m3ADffgURTJkgCLcB/s1600/Renotekno_Hadir_di_Google_Play_3.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img alt=\"download aplikasi renotekno di google play\" border=\"0\" height=\"400\" src=\"https://4.bp.blogspot.com/-nLETi0dXcSk/V7Fbo28u_EI/AAAAAAAADfg/Xg_Myc2KGTIrJje3BRS8m3ADffgURTJkgCLcB/s400/Renotekno_Hadir_di_Google_Play_3.jpg\" title=\"Renotekno Hadir di Google Play\" width=\"223\" /></a></div> <div> Gambar diatas merupakan tampilan ketika kalian membuka sebuah postingan. Terdapat tombol <b>share</b>, <b>refresh</b> dan tombol <b>back</b> pada bagian menu diatas. Ada juga tombol untuk memasukkan pos ini pada bagian favorite yang terdapat di pojok kanan bawah, tombol ini juga biasa disebut sebagai FAB ( <i>Floating Action Button</i> ). Pada bagian konten pos ini mimin menggunakan WebView untuk menampilkan nya. Kenapa mimin menggunakan WebView ? karena data konten pos terdapat tag HTML dan salah satu cara untuk menampilkanya itu menggunakan WebView.&nbsp;</div> <div> <br /></div> <div> Bisa saja dengan tidak menggunakan WebView tetapi caranya lumayan rumit, yaitu menggunakan RegEx atau bisa disebut (<i>&nbsp;Regular Exspression</i>&nbsp;) untuk memotong tag HTML dan mendapatkan teks nya saja dari konten tersebut. I am working on it !! :D</div> <div> <br /></div> <br /> Aplikasi renotekno juga masih belum begitu sempurna dan mimin berusaha untuk meningkatkanya agar lebih menarik dan memiliki fitur yang bermanfaat untuk para pembaca. Dimohon untuk memberikan kritik dan saranya pada aplikasi renotekno ini agar mimin mengetahui kekurangan dan kelebihanya. Terimakasih :D.</div> ";
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

        getSupportLoaderManager().initLoader(0, null, this);
    }

    private void inflateView() {
        int imageIndex = 0;
        if (viewToBeInflated.size() > 0){
            for (int i = 0; i < viewToBeInflated.size(); i++) {
                View view = viewToBeInflated.get(i);

                if (view instanceof ImageView) {
                    Log.d("IMAGE_SIZE", ContentLoader.imagesSrc.size() + "");
                    Glide.with(MainActivity.this).load(ContentLoader.imagesSrc.get(imageIndex)).into((ImageView) view);
                    imageIndex++;
                }

                linearLayoutViewGroup.addView(view);
            }
        }
    }

    private void initView() {
        linearLayoutViewGroup = (LinearLayout) findViewById(R.id.linearLayoutViewGroup);
    }

    @Override
    public Loader<List<View>> onCreateLoader(int id, Bundle args) {
        return new ContentLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<List<View>> loader, List<View> data) {

        if (data != null && data.size() > 0) {
            // Instead of using earthQuakes.addAll(data) and earthQuakeAdapter.notifyDataSetChanged()
            // we can use the adapter instead to add all data and
            // it will be automatically notified without specifying notifyDataSetChanged()
            viewToBeInflated = data;
            inflateView();
        }
    }

    @Override
    public void onLoaderReset(Loader<List<View>> loader) {

    }
}

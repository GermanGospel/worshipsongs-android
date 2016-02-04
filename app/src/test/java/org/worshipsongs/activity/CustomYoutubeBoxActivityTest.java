package org.worshipsongs.activity;

import android.os.Build;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubePlayerView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.worshipsongs.BuildConfig;
import org.worshipsongs.R;

import static org.junit.Assert.*;

/**
 * @author: Madasamy
 * @version: 2.5.0
 */

@RunWith(CustomRobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.KITKAT)
public class CustomYoutubeBoxActivityTest
{

    private CustomYoutubeBoxActivity customYoutubeBoxActivity;

    @Before
    public void setUp()
    {
        //Robolectric.setupActivity(NavigationDrawerActivity.class);
      customYoutubeBoxActivity = Robolectric.setupActivity(CustomYoutubeBoxActivity.class);
    }

    @Test
    public void testYouTubePlayerView()
    {
        System.out.println("--youTubePlayerView--");
//        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) customYoutubeBoxActivity.findViewById(R.id.youTubePlayerView);
//        assertEquals(-2, youTubePlayerView.getLayoutParams().height);
//        assertEquals(-1, youTubePlayerView.getLayoutParams().width);
    }

}
package com.example.bottomnavigation.ui.notifications;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnavigation.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_notifications, container, false);

        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);
        final TextView textView = rootView.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });





        Button btn = (Button) rootView.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video = (VideoView) rootView.findViewById(R.id.videoView1);
                video.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/Tollywood_Bengali_Songs/Bojhena_Shey_Bojhena/Arijit_Singh_Bojhena_Se_Bojhena_(Male)_(Bestwap.in).mp3"));
                MediaController mc = new MediaController(getActivity());
                video.setMediaController(mc);
                video.animate().alpha(1);
                video.seekTo(100);
                video.requestFocus();
                video.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();

                video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video.start();
                        mc.show(0);
                        pd.dismiss();


                    }


                });


            }
        });



        Button btn1 = (Button) rootView.findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2017 Bollywood/Jab Harry Met Sejal Mp3/128 Kbps Medium Quality/Hawayein - Jab Harry Met Sejal 128 Kbps.mp3"));
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();

                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();

                    }


                });


            }
        });

        Button btn2 = (Button) rootView.findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2021 Bollywood/Mumbai Saga Mp3 Songs 2021/Shor Machega Mp3 Song - Mumbai Saga 2021/Shor Machega - Mumbai Saga 128 Kbps.mp3"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();

                    }


                });


            }
        });

        Button btn3 = (Button) rootView.findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2021 Bollywood/Time To Dance Mp3 Songs 2021/Aaye Haaye Mp3 Song - Time To Dance 2021/Aaye Haaye - Time To Dance 128 Kbps.mp3"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();

                    }


                });


            }
        });
        Button btn4 = (Button) rootView.findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2019 Bollywood/Bypass Road Mp3 Songs (2019)/So Gaya Yeh Jahan Mp3 Song - Bypass Road/So Gaya Yeh Jahan - Bypass Road 128 Kbps.mp3"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();

                    }


                });


            }
        });
        Button btn5 = (Button) rootView.findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2019 Bollywood/Chhichhore Mp3 Songs (2019)/Khairiyat Happy Mp3 Song - Chhichhore/Khairiyat (Happy) - Chhichhore 128 Kbps.mp3"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();
                    }


                });


            }
        });
        Button btn6 = (Button) rootView.findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2019 Bollywood/Chhichhore Mp3 Songs (2019)/Woh Din Arijit Singh Version - Chhichhore/Woh Din (Arijit Singh Version) - Chhichhore 128 Kbps.mp3"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();
                    }


                });


            }
        });
        Button btn7 = (Button) rootView.findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2019 Bollywood/Kabir Singh Mp3 Songs (2019)/Tera Ban Jaunga Mp3 Song - Kabir Singh/Tera Ban Jaunga - Kabir Singh 128 Kbps.mp3"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();
                    }


                });


            }
        });
        Button btn8 = (Button) rootView.findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2019 Bollywood/Super 30 Mp3 Songs (2019)/Jugraafiya Mp3 Song - Super 30/Jugraafiya - Super 30 128 Kbps.mp3"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();
                    }


                });


            }
        });
        Button btn9 = (Button) rootView.findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView1);

                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2019 Bollywood/Student Of The Year 2 Mp3 Songs (2019)/Main Bhi Nahin Soya Mp3 Song - Student Of The Year 2/Main Bhi Nahin Soya - Student Of The Year 2 128 Kbps.mp3"
                ));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Audio please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.show(0);
                        pd.dismiss();
                    }


                });


            }
        });
        return rootView;


    }

}



/*

        VideoView video = (VideoView) rootView.findViewById(R.id.videoView2);
        video.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2017 Bollywood/Jab Harry Met Sejal Mp3/128 Kbps Medium Quality/Hawayein - Jab Harry Met Sejal 128 Kbps.mp3"));
        MediaController mc=  new MediaController(getActivity());
        video.setMediaController(mc);
        video.animate().alpha(3);
        video.seekTo(100);
        video.requestFocus();
        video.bringToFront();
        ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setMessage("Buffering Audio please wait...");
        pd.show();
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mc.show(1);
                mc.setAnchorView(video);

                pd.dismiss();
                mc.setPrevNextListeners(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //next button clicked

                        pd.show();
                        video.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/Tollywood_Bengali_Songs/Bojhena_Shey_Bojhena/Arijit_Singh_Bojhena_Se_Bojhena_(Male)_(Bestwap.in).mp3"));
                        mc.setAnchorView(video);

                    }
                }, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //previous button clicked
                        pd.show();
                        video.setVideoURI(Uri.parse("https://m.bestwap2.in/load/MP3_Songs/2017 Bollywood/Jab Harry Met Sejal Mp3/128 Kbps Medium Quality/Hawayein - Jab Harry Met Sejal 128 Kbps.mp3"));

                        mc.setAnchorView(video);
                    }
                });

            }

        });

        return rootView;
    }
}


/*


    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}


 */
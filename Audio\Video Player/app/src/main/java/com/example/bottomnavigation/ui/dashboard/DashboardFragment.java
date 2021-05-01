package com.example.bottomnavigation.ui.dashboard;



import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.media.MediaPlayer;

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


public class DashboardFragment extends Fragment {
    private DashboardViewModel dashboardViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


            View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);

            dashboardViewModel =
                    new ViewModelProvider(this).get(DashboardViewModel.class);
            final TextView textView = rootView.findViewById(R.id.text_dashboard);
            dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
                @Override
                public void onChanged(@Nullable String s) {
                    textView.setText(s);
                }

            });



/*
            VideoView video3 = (VideoView) rootView.findViewById(R.id.videoView3);

            MediaController mc3 = new MediaController(getActivity());
            video3.setMediaController(mc3);

            video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Bollywood Latest Video Songs/Baaghi 3 2020 Video Songs/Do You Love Me Video Song - Baaghi 3/Do You Love Me - Baaghi 3 Hd.mp4"));

            video3.animate().alpha(1);
            video3.seekTo(100);
            video3.requestFocus();
            video3.bringToFront();
        ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setMessage("Buffering Video please wait...");
        pd.show();
            video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mc3.setAnchorView(video3);
                    pd.dismiss();

                }


            });
*/

            Button btn = (Button) rootView.findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    VideoView video = (VideoView) rootView.findViewById(R.id.videoView1);
                    video.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Bollywood Latest Video Songs/Baaghi 3 2020 Video Songs/Faaslon Mein Video Song - Baaghi 3/Faaslon Mein - Baaghi 3 Hd.mp4"));
                    MediaController mc = new MediaController(getActivity());
                    video.setMediaController(mc);
                    video.animate().alpha(1);
                    video.seekTo(100);
                    video.requestFocus();
                    video.bringToFront();
                    video.setBackgroundDrawable(null);
                    ProgressDialog pd = new ProgressDialog(getActivity());
                    pd.setMessage("Buffering Video please wait...");
                    pd.show();

                    video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            video.start();
                            mc.setAnchorView(video);
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

                                       video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Bollywood Latest Video Songs/Baaghi 3 2020 Video Songs/Do You Love Me Video Song - Baaghi 3/Do You Love Me - Baaghi 3 Hd.mp4"));

                                       video3.animate().alpha(1);
                                       video3.seekTo(100);
                                       video3.requestFocus();
                                       video3.bringToFront();
                                       video3.setBackgroundDrawable(null);
                                       ProgressDialog pd = new ProgressDialog(getActivity());
                                       pd.setMessage("Buffering Video please wait...");
                                       pd.show();
                                       video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                                           @Override
                                           public void onPrepared(MediaPlayer mp) {
                                               video3.start();
                                               mc3.setAnchorView(video3);
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

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Full_Mobile_Videos/Bollywood Videos 2017/Baadshaho/MP4/Piya More.mp4"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                video3.setBackgroundDrawable(null);
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Video please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.setAnchorView(video3);
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

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Full_Mobile_Videos/Bollywood Videos 2017/Baadshaho/MP4/Mere Rashke Qamar - Baadshaho.mp4"));
                video3.setBackgroundDrawable(null);
                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Video please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.setAnchorView(video3);
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
                video3.setBackgroundDrawable(null);
                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Full_Mobile_Videos/Bollywood Videos 2017/Baadshaho/MP4/Socha Hai - Baadshaho.mp4"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Video please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.setAnchorView(video3);
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
                video3.setBackgroundDrawable(null);
                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Full_Mobile_Videos/Bollywood Videos 2017/Jagga Jasoos/MP4/Phir Wahi.mp4"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Video please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.setAnchorView(video3);
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
                video3.setBackgroundDrawable(null);
                MediaController mc3 = new MediaController(getActivity());
                video3.setMediaController(mc3);

                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Full_Mobile_Videos/Bollywood Videos 2017/Jagga Jasoos/MP4/Ullu_Ka_Pattha.mp4"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Video please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.setAnchorView(video3);
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
                video3.setBackgroundDrawable(null);
                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Full_Mobile_Videos/Bollywood Videos 2017/Jeena  Isi Ka Naam Hai/MP4/Iraade.mp4"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Video please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.setAnchorView(video3);
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
                video3.setBackgroundDrawable(null);
                video3.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Full_Mobile_Videos/Bollywood Videos 2017/Jolly LLB 2/MP4/Bawara_Mann.mp4"));

                video3.animate().alpha(1);
                video3.seekTo(100);
                video3.requestFocus();
                video3.bringToFront();
                ProgressDialog pd = new ProgressDialog(getActivity());
                pd.setMessage("Buffering Video please wait...");
                pd.show();
                video3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video3.start();
                        mc3.setAnchorView(video3);
                        pd.dismiss();

                    }


                });


            }
        });

        return rootView;


    }

}











/*   ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setMessage("Buffering Video please wait...");
        pd.show();
video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mc.setAnchorView(video);
                pd.dismiss();
                mc.setPrevNextListeners(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //next button clicked
                        pd.show();
                        video.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Bollywood Latest Video Songs/Baaghi 3 2020 Video Songs/Do You Love Me Video Song - Baaghi 3/Do You Love Me - Baaghi 3 Hd.mp4"));
                        mc.setAnchorView(video);
                    }
                }, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //previous button clicked
                        pd.show();
                        video.setVideoURI(Uri.parse("https://m.bestwap2.in/load/Bollywood Latest Video Songs/Baaghi 3 2020 Video Songs/Faaslon Mein Video Song - Baaghi 3/Faaslon Mein - Baaghi 3 Hd.mp4"));
                        mc.setAnchorView(video);

                    }
                });

            }

        });
        */


      /*  MediaController mc=  new MediaController(getActivity());
        video.setMediaController(mc);
        video.animate().alpha(1);
        video.seekTo(100);
        video.requestFocus();
        video.bringToFront();
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mc.show(0);
                mc.setAnchorView(video);

                mc.setPrevNextListeners(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //next button clicked
                        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.bojhenatrim));


                        mc.setAnchorView(video);
                    }
                }, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //previous button clicked
                        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.bojhenatrim));
                        mc.setAnchorView(video);

                    }
                });

            }

        });

        return rootView;
    }
}
*/
/*


 mc.setAnchorView(video);
        video.requestFocus();
        video.bringToFront();


private DashboardViewModel dashboardViewModel;
     dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }

        });

        return root;



    }

        }

import android.media.MediaPlayer;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

import android.widget.VideoView;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;


import com.example.bottomnavigation.R;


        import android.widget.Toast;

public class DashboardFragment extends Fragment {
    private VideoView mVideoView;
    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);
        mVideoView = (VideoView) rootView.findViewById(R.id.videoView1);

            /*
             * Alternatively,for streaming media you can use
             * mVideoView.setVideoURI(Uri.parse(URLstring));
*//*
            mVideoView.setVideoURI(Uri.parse("android.resource://"+getActivity().getPackageName()+"/"+R.raw.ind));

            mVideoView.setMediaController(new MediaController(getActivity()));
        MediaController.setAnchorView(videoview1);
            mVideoView.requestFocus();
            mVideoView.bringToFront();

            mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    // optional need Vitamio 4.0
                    mediaPlayer.setOnVideoSizeChangedListener(this);
                }
            });

        return rootView;
    }


}





package com.example.bottomnavigation.ui.dashboard;



import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.media.MediaPlayer;

import android.widget.MediaController;

import android.widget.VideoView;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;

import com.example.bottomnavigation.R;


public class DashboardFragment extends Fragment{



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);

                VideoView video = (VideoView) rootView.findViewById(R.id.videoView1);
        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.bojhenatrim));

        MediaController mc=  new MediaController(getActivity());
        video.setMediaController(mc);
        video.animate().alpha(1);
        video.seekTo(100);
        video.requestFocus();
        video.bringToFront();
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mc.show(0);
                mc.setAnchorView(video);

                mc.setPrevNextListeners(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //next button clicked

                        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.saat));
                        mc.setAnchorView(video);
                    }
                }, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //previous button clicked
                        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.bojhenatrim));
                        mc.setAnchorView(video);

                    }
                });

            }

        });

        return rootView;
    }
}






*/
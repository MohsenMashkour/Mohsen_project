package com.example.mohsen.mohsen_project;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity_beginner extends AppCompatActivity {


    EditText edtxt; //text written by the user
    String msg; //string of the message in lower case
    public MediaPlayer smallSilence, mediumSilence, longSilence, smallMorseSon, longMorseSon;
    public int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);


        edtxt = findViewById(R.id.edittext_msg);//retrieve the edit text from the layout
        //Declaration of all the MediaPlayer
        smallSilence =  MediaPlayer.create(activity_beginner.this, R.raw.smallsilence);
        mediumSilence =  MediaPlayer.create(activity_beginner.this, R.raw.mediumsilence);
        longSilence =  MediaPlayer.create(activity_beginner.this, R.raw.longsilence);
        smallMorseSon =  MediaPlayer.create(activity_beginner.this, R.raw.smallmorseson);
        longMorseSon =  MediaPlayer.create(activity_beginner.this, R.raw.longmorseson);
    }

    public void sending(View view) {//if click on the button send

        /*Explanation of the Morse code :
        It enables to convert a character into a distinct noise, each character has its own sequence of noise
        the length of a dot is one unit of time
        A dash is 3 units of time
        space between parts of the same letter is one unit of time
        Space between letters is 3 units of time
        Space between words is 7 units*/


        msg = edtxt.getText().toString().toLowerCase(); //turn into lowercase to not have the problem to create a different case for a and A

        for ( i = 0; i<msg.length(); i++){ //for all the characters of the string
            char char1 = msg.charAt(i); //we check each character and compare it to the table value
            switch (char1){

                case 'a' : //a is ._ in morse
                    smallMorse();//1 unit of noise
                    longMorse();//3 units of noise
                    break;

                case 'b' : //b is _... in morse
                    longMorse();//3 units of noise
                    smallMorse();//1 unit of noise
                    smallMorse();//1 unit of noise
                    smallMorse();//1 unit of noise
                    break;

                case 'c' : //c is _._. in morse
                    longMorse();
                    smallMorse();
                    longMorse();
                    smallMorse();
                    break;

                case 'd'://d is _.. in morse
                    longMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case 'e'://e is . in morse
                    smallMorse();
                    break;

                case 'f'://f is .._. in morse
                    smallMorse();
                    smallMorse();
                    longMorse();
                    smallMorse();
                    break;

                case 'g'://g is _ _. in morse
                    longMorse();
                    longMorse();
                    smallMorse();
                    break;

                case 'h'://h is .... in morse
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case 'i'://i is .. in morse
                    smallMorse();
                    smallMorse();
                    break;

                case 'j'://j is ._ _ _ in morse
                    smallMorse();
                    longMorse();
                    longMorse();
                    longMorse();
                    break;

                case 'k'://k is _._ in morse
                    longMorse();
                    smallMorse();
                    longMorse();
                    break;

                case 'l'://l is ._.. in morse
                    smallMorse();
                    longMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case 'm'://m is _ _ in morse
                    longMorse();
                    longMorse();
                    break;

                case 'n'://n is _. in morse
                    longMorse();
                    smallMorse();
                    break;

                case 'o'://o is _ _ _ in morse
                    longMorse();
                    longMorse();
                    longMorse();
                    break;

                case 'p'://p is ._ _. in morse
                    smallMorse();
                    longMorse();
                    longMorse();
                    smallMorse();
                    break;

                case 'q'://q is _ _._ in morse
                    longMorse();
                    longMorse();
                    smallMorse();
                    longMorse();
                    break;

                case 'r'://r is ._. in morse
                    smallMorse();
                    longMorse();
                    smallMorse();
                    break;

                case 's'://s is ... in morse
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case 't'://t is _ in morse
                    longMorse();
                    break;

                case 'u'://u is .._ in morse
                    smallMorse();
                    smallMorse();
                    longMorse();
                    break;

                case 'v'://v is ..._ in morse
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    longMorse();
                    break;

                case 'w'://w is ._ _ in morse
                    smallMorse();
                    longMorse();
                    longMorse();
                    break;

                case 'x'://x is _.._ in morse
                    longMorse();
                    smallMorse();
                    smallMorse();
                    longMorse();
                    break;

                case 'y'://y is _._ _ in morse
                    longMorse();
                    smallMorse();
                    longMorse();
                    longMorse();
                    break;

                case 'z': //z is _ _.. in morse
                    longMorse();
                    longMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case '1'://1 is ._ _ _ _ in morse
                    smallMorse();
                    longMorse();
                    longMorse();
                    longMorse();
                    longMorse();
                    break;

                case '2'://2 is .._ _ _ in morse
                    smallMorse();
                    smallMorse();
                    longMorse();
                    longMorse();
                    longMorse();
                    break;

                case '3'://3 is ..._ _ in morse
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    longMorse();
                    longMorse();
                    break;

                case '4'://4 is .... _ in morse
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    longMorse();
                    break;

                case '5'://5 is ..... in morse
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case '6'://6 is _.... in morse
                    longMorse();
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case '7'://7 is _ _... in morse
                    longMorse();
                    longMorse();
                    smallMorse();
                    smallMorse();
                    smallMorse();
                    break;


                case '8'://8 is _ _ _.. in morse
                    longMorse();
                    longMorse();
                    longMorse();
                    smallMorse();
                    smallMorse();
                    break;

                case '9'://9 is _ _ _ _. in morse
                    longMorse();
                    longMorse();
                    longMorse();
                    longMorse();
                    smallMorse();
                    break;

                case '0'://0 is _ _ _ _ _ in morse
                    longMorse();
                    longMorse();
                    longMorse();
                    longMorse();
                    longMorse();
                    break;

                case ' ':
                    longSilence();


                default:
                    smallSilenc();//maybe change
                    break;



            }
            mediumSilence();//separation between letters
        }

    }

    //----------------------------------------------------------------------------------------
    //functions for the noise
    private void mediumSilence() {//to separate letters
        mediumSilence.start();
        while(mediumSilence.isPlaying()){}//get out from the function just if the music is finished
    }



    private void longSilence() {//to separate words
        longSilence.start();
        while(longSilence.isPlaying()){}
    }



    private void longMorse() {//_ character of the sequence
        longMorseSon.start();
        while(longMorseSon.isPlaying()){}
        smallSilenc();
    }



    private void smallSilenc() {//to separate character of the sequence
        smallSilence.start();
        while(smallSilence.isPlaying()){}
    }


    private void smallMorse() {//. character of the sequence
        smallMorseSon.start();
        while (smallMorseSon.isPlaying()){}
        smallSilenc();


    }
}

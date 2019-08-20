import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ExportTest extends PApplet {

boolean saving;
int r1 = 10;
int r2 = 20;

public void setup(){
 
 background(255);
}

public void draw(){
  rectMode(CENTER);
  fill(random(0,50));
  rect(random(width),random(height),random(r1,r2),random(r1,r2));
  
  if(saving){
   saveFrame("frame-####.png"); 
  }
}

public void keyPressed(){
 saving = !saving; 
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ExportTest" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

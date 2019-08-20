boolean saving;
int r1 = 10;
int r2 = 20;

void setup(){
 size(400,400);
 background(255);
}

void draw(){
  rectMode(CENTER);
  fill(random(0,50));
  rect(random(width),random(height),random(r1,r2),random(r1,r2));
  
  if(saving){
   saveFrame("frame-####.png"); 
  }
}

void keyPressed(){
 saving = !saving; 
}

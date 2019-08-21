int acceleration = 5;
int leftx = 158; 
int lefty = 196;
int rightx = 196;
int righty = 175;
int mouth1 = 199;
int mouth2 = 221; 
int mouth3 = 203;
int mouth4 = 218;
PImage catPic;
void setup(){ 
size(400,400);
  catPic = loadImage("fox.jpg");

                catPic.resize(width, height);

background(catPic);


}

void draw(){
       if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#ED1818); 
noStroke();
ellipse(leftx,lefty,10,10);
ellipse(rightx,righty,10,10);
ellipse(mouth1,mouth2,15,15);
ellipse(mouth3,mouth4,15,15);
}
void keyPressed() {
 leftx-=2; 
  lefty-=2;
  rightx-=2;
  righty-=2;
  mouth1+=2;
  mouth2-=2;
  mouth3-=2;
  mouth4+=2;
}

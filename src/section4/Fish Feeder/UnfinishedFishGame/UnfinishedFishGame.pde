int foodx =100;
int foody = 20;
void setup(){ 
size(400,400);
}

void draw() {
  background(141,233,237);
  fill(#6EA4E8);
  noStroke();
 foody+=1;
  ellipse(foodx, foody, 10,10);
}

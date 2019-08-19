PImage mustache;
PImage friend;
void setup() {
friend = loadImage("Happy Green Guy.jpg");
size(800, 700);
friend.resize(width,height);
}

void draw() {
background(friend);
 mustache = loadImage("Transparent Mustache .png");
 image(mustache, 210, 250);
}

package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;

import javafx.scene.shape.Circle;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    setUpTheWindow();
    prepareColorPalette();
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    //    Listen for right clicks on the window for the tortoise  --#9
    Tortoise.getBackgroundWindow().addMouseRightClickListener(listener);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //    addDot at x and y (recipe below) --#5
    //    ------------- Recipe for addDot --#6
    createCircle(x, y);
    createCircle(x, y);
    //    Move the tortoise to the current position of the mouse (x,y) --#4
    Tortoise.moveTo(x, y);
    //    ------------- End of addDot Recipe 
    //    Uncomment to write the text "Right click to clear the window" on the screen at position 100, 100 --#8
    //    new Text("Right click to clear the window").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  private void createCircle()
  {
    //        ------------- Recipe for createCircle --#3.0 (everything in this recipe)
    Circle circle = new Circle(11, ColorWheel.getNextColor());
    //           Create a new circle with a radius of 11 using the next color on the color wheel 
    circle.setTransparency(40);
    //           Change the circle to be 60% opaque 
    //           Move the circle so that it's center is at the current position of the mouse (x,y) 
    //           Place the circle on the tortoise's window 
    Tortoise.getBackgroundWindow().add(circle);
    //        ------------- End of createCircle Recipe --#3.1
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    Clear everything from the window HINT: Use Tortoise --#7
  }
  private static void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Pinks.Pink);
    ColorWheel.addColor(PenColors.Greens.Teal);
  }
  private void setUpTheWindow()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.hide();
  }
}

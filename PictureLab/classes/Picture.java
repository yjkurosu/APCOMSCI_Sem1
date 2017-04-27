import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
    public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  pixelObj.setGreen(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(255 - pixelObj.getBlue());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setRed(255 - pixelObj.getRed());
		  }
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  int average = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3;
			  pixelObj.setBlue(average);
			  pixelObj.setGreen(average);
			  pixelObj.setRed(average);
		  }
	  }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  pixelObj.setGreen(pixelObj.getGreen() - 100);
			  pixelObj.setBlue(pixelObj.getBlue() - 75);
			  pixelObj.setRed(pixelObj.getRed() + 25);
		  }
	  }  
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = width - 1; col > width / 2; col--)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }   
  }
  
  public void mirrorHorizontal()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int length = pixels.length;
	int width = pixels[0].length;
    for (int row = 0; row < length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }     
  }
  
    public void mirrorHorizontalBotToTop()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int length = pixels.length;
	int width = pixels[0].length;
    for (int row = length - 1; row > length / 2; row--)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }     
  }
  
  public void mirrorDiagonal()
  {
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftTriPixel = null;
	Pixel rightTriPixel = null;
	for(int row = 0; row < pixels.length; row++)
	{
		for(int col = 0; col < row; col++)
		{
			leftTriPixel = pixels[row][col];
			rightTriPixel = pixels[col][row];
			rightTriPixel.setColor(leftTriPixel.getColor());
		}
	}
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
		count++;
      }
    }
	System.out.println(count);
  }
  
  public void mirrorArms()
  {
	int mirrorPoint = 219;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 170; row < mirrorPoint; row++)
    {
      for (int col = 245; col < 293; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
	
	for(int row = 158; row < mirrorPoint; row++)
	{
		for(int col = 104; col < 163; col++)
		{
			topPixel = pixels[row][col];
			bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
			bottomPixel.setColor(topPixel.getColor());
		}
	}
  }
  
  public void mirrorGull()
  {
	int mirrorPoint = 352;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 232; row < 324; row++)
    {
      for (int col = 236; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy(Picture fromPic, int startRow, int startCol, int startFromRow, int startFromCol, int endFromRow, int endFromCol)
  {
	Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = startFromRow, toRow = startRow; 
         fromRow < endFromRow &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol =startFromCol, toCol = startCol; 
           fromCol < endFromCol &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }     
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0,0,0,50,50);
    this.copy(flower2,50,0,0,0,75,75);
    this.copy(flower1,200,0,10,10,15,15);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage()
  {
	  Picture swan = new Picture("swan.jpg");
	  Picture koala = new Picture("koala.jpg");
	  Picture butterfly = new Picture("butterfly1.jpg");
	  swan.mirrorDiagonal();
	  koala.negate();
	  butterfly.grayscale();
	  this.copy(swan,0,0,0,0,100,100);
	  this.copy(koala,100,0,0,0,200,200);
	  this.copy(butterfly,300,0,0,0,300,300);
	  this.mirrorVertical();
	  this.write("mycollage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
	Pixel topPixel = null;
	Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
	Color bottomColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
	
	for(int row = 0; row < pixels.length - 1; row++)
	{
		for(int col = 0; col < pixels[0].length; col++)
		{
			topPixel = pixels[row][col];
			bottomPixel = pixels[row + 1][col];
			bottomColor = bottomPixel.getColor();
			if(topPixel.colorDistance(bottomColor) > edgeDist)
				topPixel.setColor(Color.BLACK);
			else
				topPixel.setColor(Color.WHITE);
		}
	}
  }
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel topPixel = null;
    Pixel bottomPixel = null;
	Pixel[][] pixels = this.getPixels2D();
    double topAverage = 0.0;
    double bottomAverage = 0.0;
    int endRow = pixels.length  - 1;
  
    for (int row = 0; row < endRow; row++) 
	{
      for (int col = 0; col < pixels[0].length; col++) 
	  {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        topAverage = topPixel.getAverage();
        bottomAverage = bottomPixel.getAverage();
		
        if (Math.abs(topAverage - bottomAverage) < edgeDist)
          topPixel.setColor(Color.WHITE);
        else
          topPixel.setColor(Color.BLACK);
      }
    }
  }     
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
} // this } is the end of class Picture, put all new methods before this

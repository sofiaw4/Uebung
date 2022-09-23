public class BuildTree
{
   Element root;
   int aktuellerKnoten;

   public BuildTree()
   {
      root = new Element(100);
      root.left = new Element(50);
      root.right = new Element(150);
      root.insert(75);
      
     
     
   }
   
 
   
}
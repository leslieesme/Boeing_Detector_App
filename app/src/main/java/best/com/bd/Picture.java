package best.com.bd;

import android.graphics.Bitmap;

public class Picture {
    private String myComment;
    private int myPictureId;
    private Bitmap myImage;


    public Picture(String comment, int pictureId){
        this.myComment= comment;
        this.myPictureId= pictureId;
    }
    public Picture(String comment, Bitmap image){
        this.myImage = image;
        this.myComment = comment;
    }
    public String getComment(){
        return myComment;
    }
    public int getPictureId(){
        return myPictureId;
    }
    public Bitmap getImage(){
        return myImage;
    }


    public void setComment(String comment){
        this.myComment=comment;
    }
    public void setPictureId(int id){
        this.myPictureId= id;
    }

}

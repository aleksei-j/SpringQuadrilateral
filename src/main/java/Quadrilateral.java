import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Quadrilateral implements Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    @Autowired
    private MessageSource messageSource;

    @Override
    public void draw() {

        System.out.println(this.messageSource.getMessage("drawing.quadrilateral", null, "Default message", null));
        System.out.println(this.messageSource.getMessage("drawing.pointA", new Object[] {getPointA().getX(), getPointA().getY()}, "Default message", null));
        System.out.println(this.messageSource.getMessage("drawing.pointB", new Object[] {getPointB().getX(), getPointB().getY()}, "Default message", null));
        System.out.println(this.messageSource.getMessage("drawing.pointC", new Object[] {getPointC().getX(), getPointC().getY()}, "Default message", null));
        System.out.println(this.messageSource.getMessage("drawing.pointD", new Object[] {getPointD().getX(), getPointD().getY()}, "Default message", null));
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}

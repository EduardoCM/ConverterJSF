
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Cart {
    
    private double total = 1000;
    
    private double totalDos = 1000000;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalDos() {
        return totalDos;
    }

    public void setTotalDos(double totalDos) {
        this.totalDos = totalDos;
    }
    
    

    
    
}

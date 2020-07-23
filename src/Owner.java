public class Owner {
    private String name;
    private String ic_Number;
    
    
    public Owner(String name, String icNo){
        this.name = name;
        this.ic_Number = icNo;
    }

    public String toString() {
        return String.format("%-15s %-15s", name , ic_Number);
    }

}

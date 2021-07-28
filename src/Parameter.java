import java.util.ArrayList;

public class Parameter {
    String str;
    ArrayList<Parameter> parameters;

    public Parameter () {
        this.str = "";
        this.parameters = new ArrayList<>();
    }
    public Parameter (String str) {
        this.str = str;
        this.parameters = new ArrayList<>();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Parameter getParameter(int index) {
        if (index < 0 || index >  this.parameters.size()) {
            throw new ArrayIndexOutOfBoundsException("Invalid index!");
        }
        return this.parameters.get(index);
    }

    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }

    public void setParameters(ArrayList<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Integer getSize() {
        return this.parameters.size();
    }
}

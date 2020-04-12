package th.ku.emailtemplate;

import java.util.HashMap;
import java.util.Map;

public class Template {

    private String variableData;
    private String templateText;
    private Map<String,String> variables;


    public Template(String templateText){
        this.templateText = templateText;
        this.variables = new HashMap<String, String>();

    }

    public void set(String variable , String data) {
        this.variables.put(variable, data);
    }

    public String evaluate(){
        String emilBody = templateText;
        for (Map.Entry<String,String> entry : variables.entrySet()){

            String pattern ="\\$\\{"+ entry.getKey() + "\\}";
            emilBody.replaceAll(pattern,entry.getValue());

        }


        return emilBody;
    }

    private String replaceVariables() {
        String result = templateText;
        for (Map.Entry<String, String> entry : variables.entrySet()) {
            String regex = "\\$\\{" + entry.getKey() + "\\}";
            result = result.replaceAll(regex, entry.getValue());
        }
        return result;
    }

    private void checkForMissingValues(String result) {
        if (result.matches(".*\\$\\{.+\\}.*"))
            try {
                throw new MissingValueException();
            } catch (MissingValueException e) {
                e.printStackTrace();
            }

    }
}

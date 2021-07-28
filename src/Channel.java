import java.util.ArrayList;

public class Channel {

    private final Integer type;
    private final String name;
    ArrayList<SubChannel> subChannels;

    static class WriteException extends Exception {
        WriteException(String message) {
            super(message);
        }
    }

    static class SubChannel {
        final String id;
        final String type;
        String value;

        SubChannel(String id, String type) {
            this.id = id;
            this.type = type;
            this.value = "";
        }

        public String getId() {
            return id;
        }

        public String getType() {
            return type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    Channel (String name, int type, ArrayList<Parameter> parameters) {
        assert type >= 0 && type < 2;
        this.type = type;
        this.name = name;
        this.subChannels = new ArrayList<>();
        if (parameters.size() == 0) {
            SubChannel subChannel = new SubChannel(null, "String");
            this.subChannels.add(subChannel);
        } else if (parameters.size() == 1) {
            String first = parameters.get(0).getStr();
            String scType = "String";
            if (!first.equals("I/O")) {
                scType = first;
            }
            SubChannel subChannel = new SubChannel(null, scType);
            this.subChannels.add(subChannel);
        } else {
            int start = 0;
            if (parameters.get(0).getStr().equals("I/O")) {
                start++;
            }
            for (int i = start; i < parameters.size(); i += 2) {
                String id = parameters.get(i).getStr();
                String scType = parameters.get(i + 1).getStr();
                SubChannel subChannel = new SubChannel(id, scType);
                this.subChannels.add(subChannel);
            }
        }
    }

    public void write(ArrayList<String> values) throws WriteException {
        if (this.type == 0) {
            throw new WriteException("Cannot write on this channel");
        }
        if (values.size() != this.subChannels.size()) {
            throw new WriteException("Invalid number of arguments (" + this.subChannels.size() + " required)");
        }
        for (int i = 0; i < this.subChannels.size(); i++) {
            System.out.println("Writing on channel " + this.name + " [" + values.get(i) + "]");
            this.subChannels.get(i).setValue(values.get(i));
        }
    }

    public ArrayList<String> read() {
        ArrayList<String> response = new ArrayList<>();
        for (SubChannel subChannel : this.subChannels) {
            response.add(subChannel.getValue());
            subChannel.setValue("");
        }
        return response;
    }

    public boolean isEmpty() {
        for (SubChannel subChannel : this.subChannels) {
            if (!subChannel.getValue().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}

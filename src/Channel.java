import java.util.ArrayList;

public class Channel {

    int transfer = 0;        //0 envia señal, 1 envia/recibe señal
    ArrayList<SubChannel> subChannels;

    class WriteException extends Exception {
        WriteException(String message) {
            super(message);
        }
    }

    class SubChannel<T> {
        final String id;
        final String type;
        T value;

        SubChannel(String id, String type) {
            this.id = id;
            this.type = type;
            this.value = null;
        }

        public String getId() {
            return id;
        }

        public String getType() {
            return type;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    Channel (int type, ArrayList<Parameter> parameters) {
        assert type >= 0 && type < 2;
        this.transfer = type;
        this.subChannels = new ArrayList<>();
        if (parameters.size() == 0) {
            SubChannel<String> subChannel = new SubChannel<>(null, "String");
            this.subChannels.add(subChannel);
        } else if (parameters.size() == 1) {
            String first = parameters.get(0).getStr();
            String scType = "String";
            if (!first.equals("I/O")) {
                scType = first;
            }
            SubChannel<String> subChannel = new SubChannel<>(null, scType);
            this.subChannels.add(subChannel);
        } else {
            int start = 0;
            if (parameters.get(0).getStr().equals("I/O")) {
                start++;
            }
            for (int i = start; i < parameters.size(); i += 2) {
                String id = parameters.get(i).getStr();
                String scType = parameters.get(i + 1).getStr();
                if (scType.equals("Int")) {
                    SubChannel<Integer> subChannel = new SubChannel<>(id, scType);
                    this.subChannels.add(subChannel);
                    continue;
                }
                if (scType.equals("Boolean")) {
                    SubChannel<Boolean> subChannel = new SubChannel<>(id, scType);
                    this.subChannels.add(subChannel);
                    continue;
                }
                if (scType.equals("Char")) {
                    SubChannel<Character> subChannel = new SubChannel<>(id, scType);
                    this.subChannels.add(subChannel);
                    continue;
                }
                if (scType.equals("String")) {
                    SubChannel<String> subChannel = new SubChannel<>(id, scType);
                    this.subChannels.add(subChannel);
                }
            }
        }
    }

    public void write(int type, Parameter param) throws WriteException {
        if (type == 0) {
            throw new WriteException("Cannot write on this channel");
        }
    }

    public String read(int type) {
        throw new UnsupportedOperationException();
    }
}

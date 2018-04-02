import java.io.File;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DiskUsage  {


    public JSONObject get_disk_usage (String mount_point)
    {

            File folder = new File(mount_point);
            File[] list_Of_Files = folder.listFiles();

            JSONArray list = new JSONArray();
            JSONObject json = new JSONObject();

            for (File current_file : list_Of_Files) {

                if (current_file.isFile() || current_file.isDirectory()) {
                    JSONObject arrayElementOneArrayElementOne = new JSONObject();
                    arrayElementOneArrayElementOne.put(current_file.getAbsolutePath().replaceAll("\\\\", " "), current_file.length());
                    list.add(arrayElementOneArrayElementOne);
                }

            }

            json.put("files", list);

            return json;
    }
}

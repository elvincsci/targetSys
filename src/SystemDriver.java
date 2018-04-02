/**
 * Created by elvin on 4/1/18.
 */

public class SystemDriver {

    public static void main(String[] args) {

        if (args.length != 1)
        {
            System.out.println("Incorrect number of arguments were passed in");
            System.exit(0);
        }

        String mount_point = args[0];

        DiskUsage current_DiskUsage = new DiskUsage();

        System.out.println(current_DiskUsage.get_disk_usage(mount_point));

    }

}

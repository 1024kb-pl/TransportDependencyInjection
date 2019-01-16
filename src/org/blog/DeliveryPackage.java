package org.blog;

public class DeliveryPackage {
    private final String packageName;
    private final String content;

    public DeliveryPackage(String packageName, String content) {
        this.packageName = packageName;
        this.content = content;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "DeliveryPackage{" +
                "packageName='" + packageName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

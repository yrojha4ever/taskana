package pro.taskana.impl;

import java.util.Objects;

import pro.taskana.ClassificationSummary;

/**
 * Implementation for the short summaries of a classification entity.
 */
public class ClassificationSummaryImpl implements ClassificationSummary {

    protected String id;
    protected String key;
    protected String category;
    protected String type;
    protected String domain;
    protected String name;
    protected String parentId;
    protected String parentKey;
    protected int priority;
    protected String serviceLevel; // PddDThhHmmM
    protected String custom1;
    protected String custom2;
    protected String custom3;
    protected String custom4;
    protected String custom5;
    protected String custom6;
    protected String custom7;
    protected String custom8;

    ClassificationSummaryImpl() {
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    @Override
    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    @Override
    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    @Override
    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    @Override
    public String getCustom4() {
        return custom4;
    }

    public void setCustom4(String custom4) {
        this.custom4 = custom4;
    }

    @Override
    public String getCustom5() {
        return custom5;
    }

    public void setCustom5(String custom5) {
        this.custom5 = custom5;
    }

    @Override
    public String getCustom6() {
        return custom6;
    }

    public void setCustom6(String custom6) {
        this.custom6 = custom6;
    }

    @Override
    public String getCustom7() {
        return custom7;
    }

    public void setCustom7(String custom7) {
        this.custom7 = custom7;
    }

    @Override
    public String getCustom8() {
        return custom8;
    }

    public void setCustom8(String custom8) {
        this.custom8 = custom8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }

        if (!getClass().isAssignableFrom(o.getClass())) {
            return false;
        }

        ClassificationSummaryImpl that = (ClassificationSummaryImpl) o;

        if (!that.canEqual(this)) {
            return false;
        }

        return priority == that.priority
            && Objects.equals(id, that.id)
            && Objects.equals(key, that.key)
            && Objects.equals(category, that.category)
            && Objects.equals(type, that.type)
            && Objects.equals(domain, that.domain)
            && Objects.equals(name, that.name)
            && Objects.equals(parentId, that.parentId)
            && Objects.equals(parentKey, that.parentKey)
            && Objects.equals(serviceLevel, that.serviceLevel)
            && Objects.equals(custom1, that.custom1)
            && Objects.equals(custom2, that.custom2)
            && Objects.equals(custom3, that.custom3)
            && Objects.equals(custom4, that.custom4)
            && Objects.equals(custom5, that.custom5)
            && Objects.equals(custom6, that.custom6)
            && Objects.equals(custom7, that.custom7)
            && Objects.equals(custom8, that.custom8);
    }

    protected boolean canEqual(Object other) {
        return (other instanceof ClassificationSummaryImpl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, category, type, domain, name, parentId, parentKey, priority, serviceLevel, custom1,
            custom2, custom3, custom4, custom5, custom6, custom7, custom8);
    }

    @Override
    public String toString() {
        return "ClassificationSummaryImpl [id=" + id + ", key=" + key + ", category=" + category + ", type=" + type
            + ", domain=" + domain + ", name=" + name + ", parentId=" + parentId + ", parentKey=" + parentKey
            + ", priority=" + priority + ", serviceLevel=" + serviceLevel + ", custom1=" + custom1 + ", custom2="
            + custom2 + ", custom3=" + custom3 + ", custom4=" + custom4 + ", custom5=" + custom5 + ", custom6="
            + custom6 + ", custom7=" + custom7 + ", custom8=" + custom8 + "]";
    }

}

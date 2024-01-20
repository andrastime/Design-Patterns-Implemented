package factory.obj;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Cost {

        @jakarta.xml.bind.annotation.XmlValue
        private float costValue;

        public void setCostValue(float cost) {
            this.costValue = cost;
        }

        public float getCostValue() {
            return this.costValue;
        }
        @jakarta.xml.bind.annotation.XmlAttribute(name = "Cur")
        private String currency;

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getCurrency() {
            return this.currency;
        }
    }

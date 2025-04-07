package en.ase.sqt.practice.phone;

import en.ase.sqt.practice.features.AFeature;

public class PhoneBuilder {
   Phone phone = new Phone();

   public PhoneBuilder(String identifier, String version) {
       this.phone.identifier = identifier;
       this.phone.version = version;
   }

    public PhoneBuilder addFeature(AFeature feature) {
        this.phone.features.add(feature);
        return this;
    }

    public Phone build() {
        if (this.phone.identifier == null || this.phone.version == null) {
            throw new IllegalStateException("Phone must have an identifier and a version.");
        }
        return phone;
    }
}

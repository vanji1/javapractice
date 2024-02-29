package InterfacePackage;

class carVehicleClass implements VehicleInterface {

	@Override
	public carVehicleClass vehicleType() {
		System.out.println("vehicle Type - Four Wheeler");		
		return this;
	}

	@Override
	public carVehicleClass fuelType() {
		System.out.println("fuelType - Gas");	
		return this;
		
	}
	
}

class VehicleClass {
	public static carVehicleClass Usage() {
		return new carVehicleClass();
		}

}



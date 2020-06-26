package base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {

	private static Set<String> symptoms = new HashSet<>(Arrays.asList(
			"fatigue",
			"weakness",
			"pale_skin",
			"breathing_difficulties",
			"swelling",
			"change_in_color",
			"cramps",
			"bruising",
			"increased_thirst",
			"headache",
			"troube_concentrating",
			"frequent_peeing",
			"weight_loss",
			"irregular_heartbeat",
			"pounding_in_the_neck",
			"pounding_in_the_ears",
			"vision_problems",
			"headache",
			"chest_pain",
			"dizziness",
			"lightheadedness",
			"vision_problems",
			"nausea",
			"chills",
			"fever",
			"swollen_lymph_nodes",
			"enlarged_liver",
			"nosebleeds",
			"bone_pain",
			"sweating",
			"itchy_skin",
			"excessive_bleeding",
			"bloody_urine",
			"bloody_stool",
			"unexplained_irritability",
			"numb_limbs",
			"spine_pain",
			"appetite_loss",
			"mental_confusion"
	));
	
	private static Set<String> genetics = new HashSet<>(Arrays.asList(
			"iron_deficiency_anemia",
			"pernicious_anemia",
			"diabetes_type_1",
			"diabetes_type_2",
			"gestational_diabetes",
			"thrombus_blood_clot",
			"embolus_blood_clot",
			"isolated_systolic_hypertension",
			"resistant_hypertension",
			"neurally_mediated_hypotension",
			"postprandial_hypotension",
			"lymphocytic_leukemia",
			"myeloid_leukemia",
			"hodgkin_lymphoma",
			"non_hodgkin_lymphoma",
			"hemophilia_type_A",
			"hemophilia_type_B",
			"hemophilia_type_C",
			"polycythaemia_vera",
			"primary_myelofibrosis",
			"myelodysplastic_syndromes",
			"light_chain_myeloma",
			"solitary_plasmacytoma"
			
			
			
	));
	
	private static Set<String> diagnosis = new HashSet<>(Arrays.asList(
			"iron_deficiency_anemia",
			"pernicious_anemia",
			"diabetes_type_1",
			"diabetes_type_2",
			"gestational_diabetes",
			"thrombus_blood_clot",
			"embolus_blood_clot",
			"isolated_systolic_hypertension",
			"resistant_hypertension",
			"neurally_mediated_hypotension",
			"postprandial_hypotension",
			"lymphocytic_leukemia",
			"myeloid_leukemia",
			"hodgkin_lymphoma",
			"non_hodgkin_lymphoma",
			"hemophilia_type_A",
			"hemophilia_type_B",
			"hemophilia_type_C",
			"polycythaemia_vera",
			"primary_myelofibrosis",
			"myelodysplastic_syndromes",
			"light_chain_myeloma",
			"solitary_plasmacytoma"
	));
	
	private static Set<String> initialDiagnosis = new HashSet<String>(Arrays.asList(
			"diabetes",
			"anemia",
			"blood_clot",
			"hypertension",
			"hypotension",
			"leukemia",
			"lymphoma",
			"hemophilia",
			"thrombocytosis",
			"myeloma"
			));
	
	private static Set<String> tests = new HashSet<String>(Arrays.asList(
			"hemoglobin_check",
			"b12_check",
			"iron_check",
			"folic_acid_check",
			"blood_sugar_level",
			"glycated_hemoglobin",
			"glucose_tolerance",
			"d_dimer_level",
			"fibrin_degradation_fragment",
			"blood_pressure",
			"doppler_ultrasound_blood_flow",
			"electrocardiogram_heart_rate",
			"echodiagram_heart_rytam",
			"white_cell_count",
			"red_cell_count",
			"platelets_count",
			"lymphoma_cells_level",
			"pcr_chromosome_changes",
			"aptt_clothing_factor",
			"uric_acid_level",
			"bilirubin_level",
			"erythropoietin_level",
			"hematocrit_level",
			"creatinine_level",
			"calcium_level",
			"albumin_level",
			"ldh_level"
			
			));

	public static Set<String> getDiagnosis() {
		return diagnosis;
	}

	public static void setDiagnosis(Set<String> diagnosis) {
		Dictionary.diagnosis = diagnosis;
	}

	public static void addSymptom(String symptom) {
		Dictionary.symptoms.add(symptom);
	}

	public static void addGenetics(String genetic) {
		Dictionary.genetics.add(genetic);
	}

	
	public static Set<String> getSymptoms() {
		return symptoms;
	}

	public static void setSymptoms(Set<String> symptoms) {
		Dictionary.symptoms = symptoms;
	}

	public static Set<String> getGenetics() {
		return genetics;
	}

	public static void setGenetics(Set<String> genetics) {
		Dictionary.genetics = genetics;
	}

	public static Set<String> getInitialDiagnosis() {
		return initialDiagnosis;
	}

	public static void setInitialDiagnosis(Set<String> initialDiagnosis) {
		Dictionary.initialDiagnosis = initialDiagnosis;
	}

	public static Set<String> getTests() {
		return tests;
	}

	public static void setTests(Set<String> tests) {
		Dictionary.tests = tests;
	}
	
	
	
}

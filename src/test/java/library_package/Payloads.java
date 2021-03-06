package library_package;

public class Payloads {
	
	public static String configNew(String name)
	{
		String body = "{\"network\":{\"name\":\""+name+"\",\"architecture\":\"/gensynth/input/belgium_traffic_signs/checkpoints-0.meta\",\"weights\":\"/gensynth/input/belgium_traffic_signs/\",\"input_data_names\":[\"ph_images\",\"ph_labels\"],\"output_names\":[\"NetworkMid/dense/Relu\"],\"custom_metric_interface_file\":\"/gensynth/input/config/custom_metrics.py\",\"custom_metric_interface_class\":\"CustomMetricsTesting\",\"accuracy_name\":\"Accuracy/accuracy\",\"calculate_mean_accuracy\":true,\"loss_name\":\"Loss/Mean\",\"metrics_dependencies\":[],\"runtime_variables\":[],\"calculate_mean_metrics\":{\"loss\":true},\"metrics\":{\"loss\":\"Loss/Mean\"}},\"generator\":{\"max_cycles\":10,\"accuracy_higher_is_better\":true,\"freeze_model_name\":\"frozen\",\"reduction_ratio\":0.1,\"target_size_ratio\":0.45,\"train_baseline\":false,\"inquisitor_subsample_ratio\":0.1},\"training\":{\"max_epochs\":10,\"learn_rate_params\":{\"learning_rate\":0.001},\"optimizer_params\":{}},\"data\":{\"train_data\":\"/gensynth/input/data/bts_tfrecords/bts_train.tfrecords\",\"train_db_type\":\"tfrecord\",\"train_batch_size\":16,\"train_features\":{\"image\":{\"encode_type\":\"DT_STRING\",\"decode_type\":\"DT_FLOAT32\",\"shape\":[28,28,1],\"preprocessing\":[]},\"label\":{\"encode_type\":\"DT_INT64\",\"decode_type\":\"DT_INT32\",\"shape\":[]}},\"validation_data\":\"/gensynth/input/data/bts_tfrecords/bts_val.tfrecords\",\"validation_db_type\":\"tfrecord\",\"validation_batch_size\":16,\"validation_features\":{\"image\":{\"encode_type\":\"DT_STRING\",\"decode_type\":\"DT_FLOAT32\",\"shape\":[28,28,1],\"preprocessing\":[]},\"label\":{\"encode_type\":\"DT_INT64\",\"decode_type\":\"DT_INT32\",\"shape\":[]}},\"test_data\":\"/gensynth/input/data/bts_tfrecords/bts_val.tfrecords\",\"test_db_type\":\"tfrecord\",\"test_batch_size\":16,\"test_features\":{\"image\":{\"encode_type\":\"DT_STRING\",\"decode_type\":\"DT_FLOAT32\",\"shape\":[28,28,1],\"preprocessing\":[]},\"label\":{\"encode_type\":\"DT_INT64\",\"decode_type\":\"DT_INT32\",\"shape\":[]}}}}";
		return body;
		
	}
	
	public static String finetunePostBodyPayload1(String name)
	{
		String body = "{    \"model\": \""+name+"\",    \"cycleNumber\":1,    \"iterations\": 1,    \"trainingConfig\": {}}";
		return body;
	}
	
	public static String finetunePostPayload2(String name)
	{
		String body = "{    \"model\": \""+name+"\",    \"cycleNumber\": 2,    \"iterations\": 1,    \"trainingConfig\": {        \"learn_rate_type\": \"constant\",        \"learn_rate_params\": {            \"learning_rate\": 1        }    },    \"iterateFromBest\": true}";
		return body;
		
	}
	
	public static String configResumePostPayload(String name)
	{
		String body = "{\"network\":{\"name\":\""+name+"\",\"architecture\":\"/gensynth/input/belgium_traffic_signs/checkpoints-0.meta\",\"weights\":\"/gensynth/input/belgium_traffic_signs/\",\"input_data_names\":[\"ph_images\",\"ph_labels\"],\"output_names\":[\"NetworkMid/dense/Relu\"],\"custom_metric_interface_file\":\"/gensynth/input/config/custom_metrics.py\",\"custom_metric_interface_class\":\"CustomMetricsTesting\",\"accuracy_name\":\"Accuracy/accuracy\",\"calculate_mean_accuracy\":true,\"loss_name\":\"Loss/Mean\",\"metrics_dependencies\":[],\"runtime_variables\":[],\"calculate_mean_metrics\":{\"loss\":true},\"metrics\":{\"loss\":\"Loss/Mean\"}},\"generator\":{\"max_cycles\":10,\"accuracy_higher_is_better\":true,\"freeze_model_name\":\"frozen\",\"reduction_ratio\":0.1,\"target_size_ratio\":0.45,\"train_baseline\":false,\"inquisitor_subsample_ratio\":0.1},\"training\":{\"max_epochs\":5,\"learn_rate_params\":{\"learning_rate\":0.001},\"optimizer_params\":{}},\"data\":{\"train_data\":\"/gensynth/input/data/bts_tfrecords/bts_train.tfrecords\",\"train_db_type\":\"tfrecord\",\"train_batch_size\":16,\"train_features\":{\"image\":{\"encode_type\":\"DT_STRING\",\"decode_type\":\"DT_FLOAT32\",\"shape\":[28,28,1],\"preprocessing\":[]},\"label\":{\"encode_type\":\"DT_INT64\",\"decode_type\":\"DT_INT32\",\"shape\":[]}},\"validation_data\":\"/gensynth/input/data/bts_tfrecords/bts_val.tfrecords\",\"validation_db_type\":\"tfrecord\",\"validation_batch_size\":16,\"validation_features\":{\"image\":{\"encode_type\":\"DT_STRING\",\"decode_type\":\"DT_FLOAT32\",\"shape\":[28,28,1],\"preprocessing\":[]},\"label\":{\"encode_type\":\"DT_INT64\",\"decode_type\":\"DT_INT32\",\"shape\":[]}},\"test_data\":\"/gensynth/input/data/bts_tfrecords/bts_val.tfrecords\",\"test_db_type\":\"tfrecord\",\"test_batch_size\":16,\"test_features\":{\"image\":{\"encode_type\":\"DT_STRING\",\"decode_type\":\"DT_FLOAT32\",\"shape\":[28,28,1],\"preprocessing\":[]},\"label\":{\"encode_type\":\"DT_INT64\",\"decode_type\":\"DT_INT32\",\"shape\":[]}}}}\"";
		return body;
		
	}
}

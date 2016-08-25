# See https://docs.getchef.com/config_rb_knife.html for more information on knife configuration options

current_dir = File.dirname(__FILE__)
log_level                :info
log_location             STDOUT
node_name                "admin"
client_key               "#{current_dir}/caroldcunha.pem"
chef_server_url          "https://10.51.224.67/organizations/carolchef"
cookbook_path            ["#{current_dir}/../cookbooks"]
validation_client_name   "carolchef-validator"
validation_key           "#{current_dir}/carolchef-validator.pem"
#cookbook_path            ["/home/niloday/chef-repo/cookbooks"]

http_proxy               'http://carol_dcunha:msgre%402017@ptproxy.persistent.co.in:8080'
https_proxy              'https://carol_dcunha:msgre%402017@ptproxy.persistent.co.in:8080'
ssl_verify_mode          :verify_none




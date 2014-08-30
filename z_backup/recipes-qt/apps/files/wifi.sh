###script by rafiq####

#!/bin/sh
ip=""
id=""
way=""
ifconfig eth0 down
ifconfig wlan0 $ip
route add default gw $way
ifconfig eth0 down
iwconfig wlan0 essid $id 



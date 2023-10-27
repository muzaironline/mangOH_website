#!/bin/sh

# le nom du service
SERVICE_NAME=rj45
usage()
{
        echo "-----------------------"
        echo "Usage: $0 (stop|start|restart)"
        echo "-----------------------"
}

if [ -z $1 ]; then
        usage
fi

service_start()
{
        echo "Starting service '${SERVICE_NAME}'..."
        echo 2 > /sys/class/gpio/export
        echo out > /sys/class/gpio/gpio2/direction
        echo 1 > /sys/class/gpio/gpio2/value
        sleep 5
        ifup eth0
}

service_stop()
{
        echo "Stopping service '${SERVICE_NAME}'..."
}

case $1 in
        stop)
                service_stop
        ;;
        start)
                service_start
        ;;
        restart)
                service_stop
                service_start
        ;;
        *)
                usage
esac
exit 0


SUMMARY = "Websocket implementation for gevent"
HOMEPAGE = "http://pypi.python.org/pypi/websocket"
AUTHOR = "UNKNOWN <UNKNOWN>"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13484d110cf0f7e0713493cb09a8601c"

SRC_URI = "https://files.pythonhosted.org/packages/f2/6d/a60d620ea575c885510c574909d2e3ed62129b121fa2df00ca1c81024c87/websocket-0.2.1.tar.gz"
SRC_URI[md5sum] = "2ded54ca7c61a9a0afb93fe2666dea76"
SRC_URI[sha256sum] = "42b506fae914ac5ed654e23ba9742e6a342b1a1c3eb92632b6166c65256469a4"

S = "${WORKDIR}/websocket-0.2.1"

RDEPENDS_${PN} = ""

inherit setuptools

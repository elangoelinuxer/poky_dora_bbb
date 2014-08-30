DESCRIPTION = "An image that will launch into the demo application for the embedded (not based on X11) version of Qt."
LICENSE = "MIT"
PR = "r3"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL += "\
	${CORE_IMAGE_BASE_INSTALL} \
	libqt-embedded3support4 \
	libqt-embeddedclucene4 \
	libqt-embeddedcore4 \
	libqt-embeddeddbus4 \
	libqt-embeddedgui4 \
	libqt-embeddedhelp4 \
	libqt-embeddedmultimedia4 \
	libqt-embeddednetwork4 \
	libqt-embeddedscript4 \
	libqt-embeddedscripttools4 \
	libqt-embeddedsql4 \
	libqt-embeddedsvg4 \
	libqt-embeddedtest4 \
	libqt-embeddedwebkit4 \
	libqt-embeddedxml4 \
	libqt-embeddedxmlpatterns4 \
	qt4-embedded-fonts-ttf-dejavu \
	qt4-embedded-fonts-ttf-vera \
	qt4-embedded-plugin-iconengine-svgicon \
	qt4-embedded-plugin-imageformat-gif \
	qt4-embedded-plugin-imageformat-ico \
	qt4-embedded-plugin-imageformat-jpeg \
	qt4-embedded-plugin-imageformat-mng \
	qt4-embedded-plugin-imageformat-svg \
	qt4-embedded-plugin-imageformat-tiff \
	qt4-embedded-plugin-mousedriver-tslib \
	qt4-embedded-plugin-phonon-backend-gstreamer \
	qt4-embedded-plugin-script-dbus \
	qt4-embedded-plugin-sqldriver-sqlite \
	qt4-embedded-plugin-sqldriver-sqlmysql \
	libicui18n \
	tslib \
	tslib-calibrate \
	tslib-tests \
	opkg \
	gstreamer \
        gst-meta-base \
        gst-meta-video \
        gst-meta-audio \
	gst-plugins-good \
	gst-plugins-good-videofilter \
	gst-plugins-ugly-mpeg2dec \
	gst-plugins-bad-fbdevsink \
	pcsc-lite \
	ccid \ 
	opensc \ 
	ppp \
	ppp-dialin \
	lrzsz \
	dropbear \
	psplash \
	minicom \
	strace \
	fbgrab \
	connman \
	openobex \
	libnfc \
	obex-data-server \  
	bluez-tools \
	fuse	\
	ntp \
	usb-gadget \
	clancor-sdk72xx \ 
	clancor-qt-sdk72xx-init \
"

inherit core-image


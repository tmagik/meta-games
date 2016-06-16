
DESCRIPTION = "Games image to be used on USB stick"

IMAGE_LINGUAS = " "

LICENSE = "GPLv2"

inherit core-image image-vm

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_FEATURES += "package-management x11-base x11-sato ssh-server-dropbear"

IMAGE_FSTYPES += "vmdk"

FREECIV = "\
 freeciv-server \
 freeciv-gtk2 \
 freeciv-gtk3 \
 freeciv-qt \
"

GAMELIST = "\
 ${FREECIV} \
 etr \
 pingus \
"

IMAGE_INSTALL += " \
packagegroup-core-boot \
${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} \
${GAMELIST} \
"

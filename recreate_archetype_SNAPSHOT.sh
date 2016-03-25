export ISISREL=1.12.0-SNAPSHOT
export ISISDEV=1.12.0-SNAPSHOT
export JIRA=ISIS-1287

export ISISTMP=/c/tmp   # or as required
export ISISPAR=$ISISREL
export ISISRC=RC1
export ISISCPT=$(echo $ISISART | cut -d- -f2)
export ISISCPN=$(echo $ISISART | cut -d- -f1)

for a in simpleapp 
do
	pushd example/application/$a
	export ISISART=$a-archetype

	env | grep ISIS | sort
	sh ../../../scripts/recreate-archetype.sh $JIRA
	popd
done






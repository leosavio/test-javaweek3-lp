#!/bin/bash

# Usage: ./update_json.sh json_file
# Example: ./update_json.sh myconfig.json

# Ensure a JSON file is provided as an argument
if [ $# -ne 1 ]; then
  echo "Usage: $0 json_file"
  exit 1
fi

json_file="$1"

# Extract the URL from the gitpod gp command
url=$(gp url 8080)

# Check if URL extraction was successful
if [ -z "$url" ]; then
  echo "Error: Failed to extract URL from gitpod gp command"
  exit 1
fi

# Use sed to replace the URL between "http://" and "/api" in the JSON file
sed -i -E "s|(http://).*(/api)|\1${url}\2|g" "$json_file"

# Check if the replacement was successful
if [ $? -eq 0 ]; then
  echo "URL successfully replaced in $json_file"
else
  echo "Error: Failed to replace the URL in $json_file"
  exit 1
fi
